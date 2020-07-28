package com.itka.test.controllers;



import com.itka.test.models.User;
import com.itka.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {

@Autowired
private UserRepository userRepository;
    @GetMapping("/registration")

        public String resistr(Model model){ model.addAttribute("title","Регистрация");


            return "registration";
    }
    @PostMapping("/registration/add")

    public String add(@RequestParam String login, @RequestParam String password, @RequestParam String email, @RequestParam String fio){
        User user = new User(login,password,email,fio);
        userRepository.save(user);
        return "redirect:/users";
    }

}