package Controllers;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import ConexionDB.MongoDBConnection;
import Models.User;
import org.bson.Document;
import com.mongodb.MongoException;
import org.bson.conversions.Bson;
import com.mongodb.client.model.Filters;

public class UserControllerOLD {
    private final MongoCollection<Document> userCollection;

    public UserControllerOLD(MongoDBConnection connection) {
        MongoDatabase database = connection.getDatabase();
        userCollection = database.getCollection("Users");
    }
    private boolean usuarioExiste(String cc) {
        Bson filter = Filters.eq("cc", cc);
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
    
    private boolean insertarUsuario(Document usuarioDoc) {
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
        if (usuarioExiste(user.getCC())) {
            System.out.println("El usuario con cc " + user.getCC() + " ya existe.");
            return false; // Usuario ya existe
        }

        Document usuarioDoc = convertirUsuarioADocument(user);
        return insertarUsuario(usuarioDoc);
    }
    

    public String obtenerPrimerIdUsuario() {
        try {
            Document primerUsuario = userCollection.find().first();
            if (primerUsuario != null) {
                return primerUsuario.getObjectId("_id").toString();
            } else {
                return "No se encontraron usuarios en la colección 'Users'.";
            }
        } catch (MongoException e) {
            System.err.println("Error al obtener el ID del primer usuario: " + e.getMessage());
            return null;
        }
    }
}
