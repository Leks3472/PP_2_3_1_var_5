package web.service;

import org.springframework.stereotype.Service;
import web.DAO.UserDao;
import web.DAO.UserDaoImp;
import web.model.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService{

    private UserDao userDao;

    public UserServiceImp() {
        userDao = new UserDaoImp();
    }

    @Override
    @Transactional
    public List<User> getUser() {
        return userDao.getUser();
    }

    @Override
    @Transactional
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Override
    @Transactional
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }
}
