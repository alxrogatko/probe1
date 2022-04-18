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
    public SearchUserPageController(UserService userService){
        this.userService=userService;
    }
    @GetMapping("/search_user_page/id/{id}")
    public String showUserSearchPage(@PathVariable("id")String id, Model model){
        System.out.println("Id otladka "+id);//for debugging
model.addAttribute("id",id);
        return "search_user_page";
    }
    @PostMapping("/search_user")
    public List<User> searchUser(@RequestParam("name")String name,
                                 @RequestParam("surname")String surname,
                                 Model model){
        return    userService.getUserBySurname(surname);
         //

        //
    }

}
