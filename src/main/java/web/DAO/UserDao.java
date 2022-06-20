package web.DAO;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getUser();
    User getUserById(int id);
    void saveUser(User user);
    void updateUser(int id, User updatedUser);
    void deleteUser(int id);
}
