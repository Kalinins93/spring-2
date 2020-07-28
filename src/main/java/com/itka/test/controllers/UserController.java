package com.itka.test.controllers;

import com.itka.test.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.itka.test.repository.UserRepository;
import org.springframework.ui.Model;

@Controller
public class UserController{
    @Autowired
    private UserRepository userRepository;
@GetMapping("/users")

    public String users(Model model){
    Iterable<User> users = userRepository.findAll();
    model.addAttribute("users",users);
        return"users";
                  }
        }