package com.itka.test.controllers;



import com.itka.test.models.Rasscet;
import com.itka.test.models.User;
import com.itka.test.repository.RasscetRepository;
import com.itka.test.repository.UserRepository;
import com.itka.test.webclass.Primer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UslugiController {

    @Autowired
    private RasscetRepository rasscetRepository;

    @GetMapping("/uslugi")

        public String uslugi(Model model){
        Iterable<Rasscet> rasscet = rasscetRepository.findAll();
        model.addAttribute("rasscet",rasscet);

        return "uslugi";
    }
    @PostMapping("/uslugi/result")

    public String rascets(@RequestParam String primer){
        Primer primerweb = new Primer();
        primerweb.Search(primer);
        primerweb.calc();
        Rasscet ras = new Rasscet(primer,primerweb);
        rasscetRepository.save(ras);
        return "uslugi";

    }
}