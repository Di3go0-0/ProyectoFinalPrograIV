package Services;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ConecctionDB.MongoDBConnection;
import Models.User;
import org.bson.Document;
import com.mongodb.MongoException;
import org.bson.conversions.Bson;
import com.mongodb.client.model.Filters;

public class UserService {
    private final MongoCollection<Document> userCollection;

    public UserService(MongoDBConnection connection) {
        MongoDatabase database = connection.getDatabase();
        userCollection = database.getCollection("Users");
        this.addAdmin();
    }

    public boolean userExist(String email) {
        Bson filter = Filters.eq("email", email);
        Document usuarioExistente = userCollection.find(filter).first();
        return usuarioExistente != null;
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
            return true; // Usuario agregado con éxito
        } catch (MongoException e) {
            System.err.println("Error al agregar usuario: " + e.getMessage());
            return false; // Error al agregar usuario
        }
    }
    
    public boolean addUser(User user) {
        if (userExist(user.getCC())) {
            System.out.println("El usuario con cc " + user.getCC() + " ya existe.");
            return false; // Usuario ya existe
        }

        Document usuarioDoc = convertirUsuarioADocument(user);
        return insertUser(usuarioDoc);
    }
    
    private void addAdmin(){
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
                
        this.addUser(Admin);  
    }
   protected boolean login(String email, String password) {
        // Filtrar por el correo electrónico proporcionado
        Bson filter = Filters.eq("email", email);
        // Buscar en la base de datos
        Document usuario = userCollection.find(filter).first();

        // Verificar si se encontró un usuario con el correo electrónico proporcionado
        if (usuario != null) {
            // Obtener la contraseña almacenada en la base de datos
            String storedPassword = usuario.getString("password");
            // Verificar si la contraseña coincide con la proporcionada
            if (password.equals(storedPassword)) {
                // La contraseña coincide, inicio de sesión exitoso
                return true;
            } else {
                // La contraseña no coincide
                System.out.println("Contraseña incorrecta.");
                return false;
            }
        } else {
            // No se encontró un usuario con el correo electrónico proporcionado
            System.out.println("No se encontró un usuario con el correo electrónico proporcionado.");
            return false;
        }
    }
 
    
    

    
}
