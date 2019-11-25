package ru.zakup.zakupshik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.zakup.zakupshik.domain.Message;
import ru.zakup.zakupshik.repo.MessageRepo;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/")
    public String getMessages(String name, Model model) {

        List<Message> allMessages = messageRepo.findAll();
        model.addAttribute("messages", allMessages);
        return "main";
    }

    @PostMapping("/")
    public String addMessage(){
        return "main";
    }
}
