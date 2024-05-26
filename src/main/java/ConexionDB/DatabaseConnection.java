package ConexionDB;

import com.mongodb.client.MongoDatabase;
/**
 *
 * @author Administrator
 */
public interface DatabaseConnection {
    void connect();
    MongoDatabase getDatabase();
    void close();
}
