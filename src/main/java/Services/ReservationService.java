package Services;

import Models.Reservation;
import java.util.ArrayList;
import java.util.List;
import ConecctionDB.MongoDBConnection;
import Interfaces.IReservationsService;
import Utils.ReservationConverter;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.UpdateResult;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class ReservationService extends MongoDBConnection implements IReservationsService {
    private MongoCollection<Document> reservationCollection;
   
    public ReservationService() {
        connect(); // Llama al método connect() de MongoDBConnection para establecer la conexión
        this.reservationCollection = getDatabase().getCollection("Reservations"); // Obtén la colección después de la conexión
    }

    @Override
    public boolean create(Reservation reservation) {
        Document document = ReservationConverter.convertirReservationADocument(reservation);
        reservationCollection.insertOne(document);
        return true;
    }

    @Override
    public boolean update(Reservation reservation) {
        try {
            ObjectId objectId = new ObjectId(reservation.getId());
            Bson filter = Filters.eq("_id", objectId);
            Document document = ReservationConverter.convertirReservationADocument(reservation);

            UpdateResult result = reservationCollection.replaceOne(filter, document);
            long modifiedCount = result.getModifiedCount();
            return modifiedCount > 0;
        } catch (IllegalArgumentException e) {
            // Log the exception and/or inform the user
            System.err.println("Error al actualizar la reservación: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(String roomId) {
        try {
            ObjectId objectId = new ObjectId(roomId);
            Bson filter = Filters.eq("_id", objectId);
            if (reservationCollection.deleteOne(filter).getDeletedCount() == 0) {
                return false; // No se encontró ningún documento para eliminar
            }
            return true; // Se eliminó correctamente
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return false; // El formato del ID no es válido
        }
    }

    @Override
    public List<Reservation> listReservationUser(String idClient) {
        List<Reservation> reservations = new ArrayList<>();
        Bson filter = Filters.eq("idClient", idClient); // Crear filtro para idClient
        for (Document document : reservationCollection.find(filter)) {
            reservations.add(ReservationConverter.convertirDocumentAReservation(document));
        }
        return reservations;
    }
    
    public List<Reservation> listReservationAdmin() {
        List<Reservation> reservations = new ArrayList<>();
        for (Document document : reservationCollection.find()) {
            reservations.add(ReservationConverter.convertirDocumentAReservation(document));
        }
        return reservations;
    }

    @Override
    public Reservation getReservationById(String reservationId) {
        try {
            ObjectId objectId = new ObjectId(reservationId);
            Bson filter = Filters.eq("_id", objectId);
            Document document = reservationCollection.find(filter).first();
            if (document != null) {
                return ReservationConverter.convertirDocumentAReservation(document);
            } else {
                return null; // No se encontró la reserva con el ID especificado
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return null; // El formato del ID no es válido
        }
    }
    
    public List<Reservation> listReservationsRoom(String idRoom) {
        List<Reservation> reservations = new ArrayList<>();
        Bson filter = Filters.eq("idRoom", idRoom); // Crear filtro para idClient
        for (Document document : reservationCollection.find(filter)) {
            reservations.add(ReservationConverter.convertirDocumentAReservation(document));
        }
        return reservations;
    }
}
