package Controllers;

import ConecctionDB.MongoDBConnection;
import Services.RoomsService;

public class RoomController extends RoomsService{
    
    public RoomController(MongoDBConnection connection) {
        super(connection);
    }
    
}
