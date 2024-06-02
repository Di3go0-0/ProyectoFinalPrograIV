package Services;

import Models.Room;
import java.util.ArrayList;
import java.util.List;
import ConecctionDB.MongoDBConnection;
import Interfaces.IRoomsService;
import Utils.RoomConverter;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

/**
 * Servicio para gestionar las habitaciones.
 * Implementa la interfaz IRoomsService.
 */
public class RoomsService extends MongoDBConnection implements IRoomsService {
    private MongoCollection<Document> roomCollection;

    public RoomsService() {
        connect(); // Llama al método connect() de MongoDBConnection para establecer la conexión
        this.roomCollection = getDatabase().getCollection("Rooms"); // Obtén la colección después de la conexión
    }

    @Override
    public boolean create(Room room) {
        if (roomExist(room.getNumber())) {
            return false;
        }
        Document document = RoomConverter.convertirRoomADocument(room);
        roomCollection.insertOne(document);
        return true;
    }

    @Override
    public boolean update(Room room) {
        try {
            ObjectId objectId = new ObjectId(room.getId());
            Bson filter = Filters.eq("_id", objectId);
            Document document = RoomConverter.convertirRoomADocument(room);

            UpdateResult result = roomCollection.replaceOne(filter, document);
            long modifiedCount = result.getModifiedCount();
            if (modifiedCount == 0) {
                return false;
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: El ID de la habitación no es válido.");
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        try {
            ObjectId objectId = new ObjectId(id);
            Bson filter = Filters.eq("_id", objectId);
            if (roomCollection.deleteOne(filter).getDeletedCount() == 0) {
                return false; // No se encontró ningún documento para eliminar
            }
            return true; // Se eliminó correctamente
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false; // El formato del ID no es válido
        }
    }

    @Override
    public List<Room> list() {
        List<Room> rooms = new ArrayList<>();
        for (Document document : roomCollection.find()) {
            rooms.add(RoomConverter.convertirDocumentARoom(document));
        }
        return rooms;
    }

    @Override
    public Room getRoomByID(String id) {
        ObjectId objectId = new ObjectId(id);
        Bson filter = Filters.eq("_id", objectId);
        Document document = roomCollection.find(filter).first();
        if (document == null) {
            return null;
        }
        return RoomConverter.convertirDocumentARoom(document);
    }

    public boolean roomExist(String number) {
        Bson filter = Filters.eq("number", number);
        Document existingRoom = roomCollection.find(filter).first();
        return existingRoom != null;
    }
}
