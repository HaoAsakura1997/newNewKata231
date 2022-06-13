package com.haoAsakura97.FirstSpringBoot.service;

import com.haoAsakura97.FirstSpringBoot.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);
    List<User> findAll();
    User saveUser(User user);
    void deleteById(Long id);
}
