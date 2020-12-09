package pl.weekop.service;

import pl.weekop.dao.DAOFactory;
import pl.weekop.dao.UserDAO;
import pl.weekop.model.User;

public class UserService {
    public void addUser(String username, String email, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setActive(true);
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDao = factory.getUserDAO();
        userDao.create(user);
    }
}