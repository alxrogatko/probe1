package by.rogatko.alx.controllers;


import by.rogatko.alx.entity.User;
import by.rogatko.alx.services.MessageService;
import by.rogatko.alx.services.UserService;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import java.util.ArrayList;
import java.util.List;

@SessionAttributes("userId")
@Controller
public class SearchUserPageController {

    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String id;
    @Autowired
    private UserService userService;

    @Autowired
    // private MessageService messageService;
    public SearchUserPageController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/search_user_page/id/{id}")
    public String showUserSearchPage(@PathVariable("id") String id, Model model) {

        model.addAttribute("id", id);
        return "search_user_page";
    }

    @PostMapping("/search_user_page/id/{id}")
    public String searchUser(@RequestParam("name") String name,
                             @RequestParam("surname") String surname,
                             Model model, @PathVariable String id) {
        //System.out.println("Id otladka !!!");//for debugging
        List<User> users; //= new ArrayList<>();

       users = userService.getUserBySurname(surname);
     if(!users.isEmpty()){ model.addAttribute("listOfUsers", users);


            System.out.println(users.get(0).getName()+" "+users.get(0).getSurname());//отладка
       }

        return "search_user_page";
        //

        //
    }

}
