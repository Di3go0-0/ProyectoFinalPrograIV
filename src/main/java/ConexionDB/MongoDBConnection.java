package ConexionDB;

import com.mongodb.MongoException;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import io.github.cdimascio.dotenv.Dotenv;

public class MongoDBConnection implements DatabaseConnection {
    Dotenv dotenv = Dotenv.load();

    private MongoClient mongoClient;
    private MongoDatabase database;
    private boolean conexionExitosa;

    private final String MONGOURL = dotenv.get("DB_MONGO_URL");
    private final String NAMEDB = dotenv.get("DB_DATABASE_NAME");

    public MongoDBConnection() {}

    @Override
    public void connect() {
        try {
            // Crear un nuevo cliente de MongoDB
            mongoClient = MongoClients.create(MONGOURL);

            // Obtener la base de datos "BooksHotel"
            database = mongoClient.getDatabase(NAMEDB);
            System.out.println("Conexión exitosa a MongoDB");
            conexionExitosa = true;
        } catch (MongoException e) {
            System.err.println("Error al conectar a MongoDB: " + e.getMessage());
            conexionExitosa = false;
        }
    }

    @Override
    public MongoDatabase getDatabase() {
        return database;
    }

    @Override
    public void close() {
        if (mongoClient != null) {
            mongoClient.close();
        }
    }

    public boolean isConexionExitosa() {
        return conexionExitosa;
    }
}
