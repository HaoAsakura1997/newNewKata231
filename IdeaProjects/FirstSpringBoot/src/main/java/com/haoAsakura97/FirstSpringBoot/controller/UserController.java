package com.haoAsakura97.FirstSpringBoot.controller;

import com.haoAsakura97.FirstSpringBoot.model.User;
import com.haoAsakura97.FirstSpringBoot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping("/")
    public String getAllUsers(Model model) {
        model.addAttribute("user", userService.findAll());
        return "users";
    }

    @GetMapping("/add")
    public String addUserForm(User user) {
        return "add";
    }

    @PostMapping("/add")
    public String addUser(User user) {
        userService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteById(id);
        return "redirect:/";
    }
    @GetMapping("update/{id}")
    public String updateUserForm(@PathVariable Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "/update";
    }

    @PostMapping("/update")
    public String updateUser(User user) {
        userService.saveUser(user);
        return "redirect:/";
    }





}
