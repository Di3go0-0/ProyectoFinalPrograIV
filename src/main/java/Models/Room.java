
package Models;


public class Room {
    private String id;
    private String number;
    private String type;
    private String capacity;
    private String priceNight;

    
    public Room(String id,
                String Number,
                String Type,
                String Capacity,
                String PriceNight){
        
        this.id = id;
        this.number = Number;
        this.type = Type;
        this.capacity = Capacity;
        this.priceNight = PriceNight;
    
    }
    
    public Room(String Number,
                String Type,
                String Capacity,
                String PriceNight){
        
        this.number = Number;
        this.type = Type;
        this.capacity = Capacity;
        this.priceNight = PriceNight;
    
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getPriceNight() {
        return priceNight;
    }

    public void setPriceNight(String priceNight) {
        this.priceNight = priceNight;
 
    }
}
