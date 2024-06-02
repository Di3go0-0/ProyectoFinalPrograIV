package Utils;

import Models.User;
import org.bson.Document;

public class UserConverter {
    public static Document convertToDocument(User user) {
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

    public static User convertToUser(Document document) {
        return new User(
                document.getObjectId("_id").toString(),
                document.getString("typeCC"),
                document.getString("cc"),
                document.getString("name"),
                document.getString("lastName"),
                document.getString("email"),
                document.getString("address"),
                document.getString("city"),
                document.getString("phone"),
                document.getString("password"),
                document.getString("typeUser")
        );
    }
}
