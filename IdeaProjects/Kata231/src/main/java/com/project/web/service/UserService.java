package com.project.web.service;

import com.project.web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(int id);
}
