package com.project.web.dao;



import com.project.web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(int id);

}
