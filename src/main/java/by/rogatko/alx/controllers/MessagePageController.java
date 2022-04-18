package by.rogatko.alx.controllers;

import by.rogatko.alx.entity.User;
import by.rogatko.alx.services.MessageService;
import by.rogatko.alx.services.UserService;
import lombok.SneakyThrows;
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


    private String id;


    @SneakyThrows
    @GetMapping({"/message_page/id/{id}"})
    public String showMessagePage(@PathVariable("id") String id, Model model) {
       // System.out.println("Отладка message page");//for debugging
        model.addAttribute("id", id);

        User user = userService.getUserById(id);
        model.addAttribute("printName", user.getName() + " " + user.getSurname());
        //работаю над этим
model.addAttribute("outMessages",messageService.getMessagesBySenderId(id));
model.addAttribute("inMessages",messageService.getMessagesByRecipientId(id));
//конец
        return "/message_page";
    }

    @GetMapping("/my_main_page")
    public String returnToMyMainPage() {
        return "my_main_page" ;

    }
}


