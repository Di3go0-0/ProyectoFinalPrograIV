package Models;

public class User {
    private String id;
    private String typeCC;
    private String cc;
    private String name;
    private String lastName;
    private String email;
    private String address;
    private String city;
    private String phone;
    private String password;
    private String typeUser;

    public User (String id,
                 String typeCC, 
                 String cc, 
                 String name, 
                 String lastName, 
                 String email, 
                 String address, 
                 String city, 
                 String phone, 
                 String password, 
                 String typeUser){
        this.id = id;
        this.typeCC = typeCC;
        this.cc = cc;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.password = password;
        this.typeUser = typeUser;
    }
    public User (String typeCC, 
                 String cc, 
                 String name, 
                 String lastName, 
                 String email, 
                 String address, 
                 String city, 
                 String phone, 
                 String password, 
                 String typeUser){
        
        this.typeCC = typeCC;
        this.cc = cc;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.city = city;
        this.phone = phone;
        this.password = password;
        this.typeUser = typeUser;
    }
    public User(){
        this.id = "0";
        this.typeCC = "CC";
        this.cc = "00000";
        this.name = "name";
        this.lastName = "lastName";
        this.email = "email";
        this.address = "address";
        this.city = "city";
        this.phone = "phone";
        this.password = "password";
        this.typeUser = "typeUser";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
    
    
    public String getTypeCC(){
        return typeCC;
    }
    public String getCC(){
        return cc;
    }
    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getPhone(){
        return phone;
    }
    public String getPassword(){
        return password;
    }
    public String getTypeUser(){
        return typeUser;
    }
}
