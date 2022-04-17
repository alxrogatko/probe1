package by.rogatko.alx.controllers;

import by.rogatko.alx.services.MessageService;
import by.rogatko.alx.services.UserService;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Controller
@SessionAttributes("userId")
public class MessagePageController {
    @Autowired
    private UserService userService;
    @Autowired
    private MessageService messageService;


    //

    private String id;
    //


    @GetMapping({"/message_page/id/{id}"})
    public String showMessagePage(@PathVariable("id") String id, Model model) {
        model.addAttribute("id", id);
        System.out.println("message page");

        return "/message_page"  ;
    }

    @GetMapping("/my_main_page")
    public String returnToMain(){
return "my_main_page"+"/id/"+id;

    }
}


