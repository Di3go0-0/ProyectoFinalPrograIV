package Services;

import Models.Room;
import java.util.ArrayList;
import java.util.List;
import ConecctionDB.MongoDBConnection;
import Interfaces.IRoomsService;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 * Servicio para gestionar las habitaciones.
 * Implementa la interfaz IRoomsService.
 */
public class RoomsService implements IRoomsService {
    private final MongoCollection<Document> roomCollection;

    public RoomsService(MongoDBConnection connection) {
        MongoDatabase database = connection.getDatabase();
        roomCollection = database.getCollection("Rooms");
    }

    private Document convertirRoomADocument(Room room) {
        return new Document("id", room.getId())
                .append("number", room.getNumber())
                .append("type", room.getType())
                .append("capacity", room.getCapacity())
                .append("priceNight", room.getPriceNight());
    }

    private Room convertirDocumentARoom(Document document) {
        return new Room(
                document.getString("id"),
                document.getString("number"),
                document.getString("type"),
                document.getString("capacity"),
                document.getString("priceNight")
        );
    }

    @Override
    public boolean create(Room room){
        if (roomExist(room.getNumber())) {
            return false;
        }
        Document document = convertirRoomADocument(room);
        roomCollection.insertOne(document);
        return true;
    }

    @Override
    public boolean update(Room room){
        Bson filter = Filters.eq("id", room.getId());
        Document document = convertirRoomADocument(room);
        if (roomCollection.replaceOne(filter, document).getModifiedCount() == 0) {
            return false;
        }
        return true;
    }

    @Override
    public boolean delete(String roomId){
        Bson filter = Filters.eq("id", roomId);
        if (roomCollection.deleteOne(filter).getDeletedCount() == 0) {
            return false;
        }
        return true;
    }

    @Override
    public List<Room> list(String title){
        List<Room> rooms = new ArrayList<>();
        for (Document document : roomCollection.find()) {
            rooms.add(convertirDocumentARoom(document));
        }
        return rooms;
    }

    @Override
    public Room getRoomByID(String roomId){
        Bson filter = Filters.eq("id", roomId);
        Document document = roomCollection.find(filter).first();
        if (document == null) {
            return null;
        }
        return convertirDocumentARoom(document);
    }

    public boolean roomExist(String number) {
        Bson filter = Filters.eq("number", number);
        Document existingRoom = roomCollection.find(filter).first();
        return existingRoom != null;
    }
}
