package by.rogatko.alx.controllers;

import by.rogatko.alx.services.UserService;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Controller
@SessionAttributes("userId")


public class MainPageController {
    public MainPageController(UserService userService) {
        this.userService = userService;
    }

    //
    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String id;
    //
    @Autowired
    private UserService userService;

    @GetMapping({"/my_main_page/id/{id}"})
    public String showMainPage(@PathVariable("id") String id, Model model) {
        String message = userService.getUserById(id).getName() + " " + userService.getUserById(id).getSurname();
        model.addAttribute("owner", " " + message);
        System.out.println(message);

        return "my_main_page";
    }


}
