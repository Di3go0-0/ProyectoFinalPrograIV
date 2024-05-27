package Controllers;


import Models.User;
import ConecctionDB.MongoDBConnection;
import Services.UserService;


public class UserController extends UserService {
    public UserController(MongoDBConnection connection) {
        super(connection);
    }

    public boolean Register(User user) {
        return addUser(user);
    }
    
    public boolean Login(String email, String password){
        return login(email, password);
    }
    
    public boolean checkUserExistence(String email) {
        return userExist(email);
    }

}
