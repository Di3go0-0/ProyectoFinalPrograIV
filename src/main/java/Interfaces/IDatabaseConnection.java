package Interfaces;

import com.mongodb.client.MongoDatabase;
/**
 *
 * @author Administrator
 */
public interface IDatabaseConnection {
    void connect();
    MongoDatabase getDatabase();
    void close();
}
