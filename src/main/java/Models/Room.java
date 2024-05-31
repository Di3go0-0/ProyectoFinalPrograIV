
package Models;


public class Room {
    private String id;
    private String Number;
    private String Type;
    private String Capacity;
    private String PriceNight;

    
    public Room(String id,
                String Number,
                String Type,
                String Capacity,
                String PriceNight){
        
        this.id = id;
        this.Number = Number;
        this.Type = Type;
        this.Capacity = Capacity;
        this.PriceNight = PriceNight;
    
    }
    
    public Room(String Type,
                String Number,
                String Capacity,
                String PriceNight){
        
        this.Number = Number;
        this.Type = Type;
        this.Capacity = Capacity;
        this.PriceNight = PriceNight;
    
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }
    
    public Room(){}
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getCapacity() {
        return Capacity;
    }

    public void setCapacity(String Capacity) {
        this.Capacity = Capacity;
    }

    public String getPriceNight() {
        return PriceNight;
    }

    public void setPriceNight(String PriceNight) {
        this.PriceNight = PriceNight;
    }
    
    
}
