package Interfaces;

import Models.User;

public interface IUsersService {
    boolean userExist(String email);
    boolean register(User user);
    boolean login(String email, String password);
    User getUserByEmail(String email);
}
