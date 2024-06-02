package Utils;

import Models.Reservation;
import org.bson.Document;
import org.bson.types.ObjectId;

public class ReservationConverter {
    public static Document convertirReservationADocument(Reservation reservation) {
        Document document = new Document("idClient", reservation.getIdClient())
                .append("idRoom", reservation.getIdRoom())
                .append("numberRoom", reservation.getNumberRoom())
                .append("numberPersons", reservation.getNumberPersons())
                .append("dateEntry", reservation.getDateEntry())
                .append("dateExit", reservation.getDateExit())
                .append("totalPrice", reservation.getTotalPrice())
                .append("priceNigth", reservation.getPriceNigth())
                .append("capacityRoom", reservation.getCapacityRoom());
        if (reservation.getId() != null && !reservation.getId().isEmpty()) {
            document.append("_id", new ObjectId(reservation.getId()));
        }
        return document;
    }

    public static Reservation convertirDocumentAReservation(Document document) {
        return new Reservation(
                document.getObjectId("_id").toString(),
                document.getString("idClient"),
                document.getString("idRoom"),
                document.getString("numberRoom"),
                document.getString("numberPersons"),
                document.getString("dateEntry"),
                document.getString("dateExit"),
                document.getString("totalPrice"),
                document.getString("priceNigth"),
                document.getString("capacityRoom")
        );
    }
}
