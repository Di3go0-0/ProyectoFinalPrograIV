package Services;

import com.mongodb.client.MongoCollection;
import Interfaces.IUsersService;
import ConecctionDB.MongoDBConnection;
import Models.User;
import org.bson.Document;
import com.mongodb.MongoException;
import org.bson.conversions.Bson;
import com.mongodb.client.model.Filters;

public class UserService extends MongoDBConnection implements IUsersService{
    private MongoCollection<Document> userCollection;
    private User loggedUser;

    public User getLoggedUser() {
        return loggedUser;
    }

    public void setLoggedUser(User loggedUser) {
        this.loggedUser = loggedUser;
    }

    public UserService() {
        connect();
        this.userCollection = getDatabase().getCollection("Users");
        this.addAdmin();
    }

    @Override
    public boolean userExist(String email) {
        Bson filter = Filters.eq("email", email);
        Document usuarioExistente = userCollection.find(filter).first();
        return usuarioExistente != null;
    }

    @Override
    public boolean register(User user) {
        if (userExist(user.getEmail())) {
            System.out.println("El usuario con email " + user.getEmail() + " ya existe.");
            return false;
        }

        Document usuarioDoc = convertirUsuarioADocument(user);
        return insertUser(usuarioDoc);
    }

    @Override
    public boolean login(String email, String password) {
        Bson filter = Filters.eq("email", email);
        Document usuario = userCollection.find(filter).first();

        if (usuario != null) {
            String storedPassword = usuario.getString("password");
            if (password.equals(storedPassword)) {
                return true;
            } else {
                System.out.println("Contraseña incorrecta.");
                return false;
            }
        } else {
            System.out.println("No se encontró un usuario con el correo electrónico proporcionado.");
            return false;
        }
    }

    @Override
    public User getUserByEmail(String email) {
        Bson filter = Filters.eq("email", email);
        Document usuario = userCollection.find(filter).first();

        if (usuario != null) {
            this.loggedUser = new User(
                    usuario.getObjectId("_id").toString(),
                    usuario.getString("typeCC"),
                    usuario.getString("cc"),
                    usuario.getString("name"),
                    usuario.getString("lastName"),
                    usuario.getString("email"),
                    usuario.getString("address"),
                    usuario.getString("city"),
                    usuario.getString("phone"),
                    usuario.getString("password"),
                    usuario.getString("typeUser")
            );
            return this.loggedUser;
        } else {
            System.out.println("No se encontró un usuario con el correo electrónico proporcionado.");
            this.loggedUser = null;
            return null;
        }
    }

    private Document convertirUsuarioADocument(User user) {
        return new Document("typeCC", user.getTypeCC())
                .append("cc", user.getCC())
                .append("name", user.getName())
                .append("lastName", user.getLastName())
                .append("email", user.getEmail())
                .append("address", user.getAddress())
                .append("city", user.getCity())
                .append("phone", user.getPhone())
                .append("password", user.getPassword())
                .append("typeUser", user.getTypeUser());
    }

    private boolean insertUser(Document usuarioDoc) {
        try {
            userCollection.insertOne(usuarioDoc);
            System.out.println("Usuario agregado correctamente.");
            return true;
        } catch (MongoException e) {
            System.err.println("Error al agregar usuario: " + e.getMessage());
            return false;
        }
    }

    private void addAdmin() {
        User Admin = new User("CC",
                "12345",
                "Juan",
                "Rincon",
                "rinconj039@gmail.com",
                "123 Street",
                "City",
                "1234567890",
                "12345",
                "Admin");

        if (!userExist(Admin.getEmail())) {
            this.register(Admin);
        }
    }
}
