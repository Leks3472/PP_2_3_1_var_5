package web.DAO;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoImp implements UserDao {
    private static int USER_ID;
    private List<User> userList = new ArrayList<>();

    public UserDaoImp() {
        userList.add(new User(++USER_ID, "User1", 10,"User1@mail.ru"));
        userList.add(new User(++USER_ID, "User2", 20, "User2@mail.ru"));
        userList.add(new User(++USER_ID, "User3", 30, "User3@mail.ru"));
        userList.add(new User(++USER_ID, "User4", 40, "User4@mail.ru"));
        userList.add(new User(++USER_ID, "User5", 50,  "User5@mail.ru"));
    }

    @Override
    public List<User> getUser() {
        return userList.stream().toList();
    }

    @Override
    public User getUserById(int id) {
        return userList.stream().filter(userList -> userList.getId() == id).findAny().orElse(null);
    }

    @Override
    public void saveUser(User user) {
        user.setId(++USER_ID);
        userList.add(user);
    }

    @Override
    public void updateUser(int id, User updatedUser) {
        User userToBeUpdated = getUserById(id);
        userToBeUpdated.setName(updatedUser.getName());
        userToBeUpdated.setAge(updatedUser.getAge());
        userToBeUpdated.setEmail(updatedUser.getEmail());



    }

    @Override
    public void deleteUser(int id) {
        userList.removeIf(p -> p.getId() == id);
    }
}
