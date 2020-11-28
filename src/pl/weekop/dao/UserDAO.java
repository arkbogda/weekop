package pl.weekop.dao;

import java.util.List;

import pl.weekop.model.User;


public interface UserDAO extends GenericDAO<User, Long> {

    List<User> getAll();
    User getUserByUsername(String username);

}