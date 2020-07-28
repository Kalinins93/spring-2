package com.itka.test.controllers;



import com.itka.test.models.User;
import com.itka.test.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UslugiController {



    @GetMapping("/uslugi")

        public String uslugi(Model model){ model.addAttribute("title","услуги");

        return "uslugi";
    }

}