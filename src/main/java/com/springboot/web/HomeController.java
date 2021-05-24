package com.springboot.web;

import java.security.Principal;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.model.User;
import com.springboot.model.Message;
import com.springboot.service.UserService;
import com.springboot.service.MessageService;



 @Controller
public class HomeController {    
    
    @Autowired
    private MessageService messageService;
    @Autowired
    private UserService userService;
    private User user;

    @GetMapping("/home")
    public String home(Principal principal,Model model){        
        user=userService
        .findByEmail(
            principal.getName()
        );
        model.addAttribute("msgs"
                            ,messageService
                            .messageList(
                                user
                                ));
        return "userhome";
    }

    @PostMapping("/messages")
    public String saveMessage(Principal principal
                            ,Message message){                                        
		 messageService.saveMessage( user, message); 
        return "redirect:/home";
    }
}