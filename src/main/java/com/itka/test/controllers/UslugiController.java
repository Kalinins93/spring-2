package com.itka.test.controllers;


import com.itka.test.models.Client;
import com.itka.test.models.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class UslugiController {
    @Autowired
    private ClientRepository clientRepository;

    @GetMapping("/uslugi")
    public String spisok(Model model){
        Iterable<Client> client = clientRepository.findAll();
        model.addAttribute("clinet",client);
        return "uslugi";
    }

}