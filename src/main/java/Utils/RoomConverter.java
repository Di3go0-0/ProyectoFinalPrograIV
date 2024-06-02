package Utils;

import Models.Room;
import org.bson.Document;
import org.bson.types.ObjectId;

public class RoomConverter {
    public static Document convertirRoomADocument(Room room) {
        Document document = new Document("number", room.getNumber())
                .append("type", room.getType())
                .append("capacity", room.getCapacity())
                .append("priceNight", room.getPriceNight());
        if (room.getId() != null && !room.getId().isEmpty()) {
            document.append("_id", new ObjectId(room.getId()));
        }
        return document;
    }

    public static Room convertirDocumentARoom(Document document) {
        return new Room(
                document.getObjectId("_id").toString(),
                document.getString("number"),
                document.getString("type"),
                document.getString("capacity"),
                document.getString("priceNight")
        );
    }
}
