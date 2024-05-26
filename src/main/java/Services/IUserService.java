package Services;

import Models.User;

public interface IUserService {
    boolean addUser(User user);
    String getFirstUserId();
}
