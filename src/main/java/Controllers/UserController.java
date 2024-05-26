package Controllers;


import Models.User;
import Services.UserService;
import ConexionDB.MongoDBConnection;


public class UserController {
    private final UserService userService;

    public UserController(MongoDBConnection connection) {
        this.userService = new UserService(connection);
    }

    public boolean Register(User user) {
        return userService.addUser(user);
    }
    

    public String obtenerPrimerIdUsuario() {
        return userService.obtenerPrimerIdUsuario();
    }
}
