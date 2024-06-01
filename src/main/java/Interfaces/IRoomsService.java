
package Interfaces;

import Models.Room;
import java.util.List;

import java.util.List;

public interface IRoomsService {
    public boolean create(Room room);
    public boolean update(Room room);
    public boolean delete(String roomId);
    public List<Room> list(String title);
    public Room getRoomByID(String roomId);
}
