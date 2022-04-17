package by.rogatko.alx.controllers;


import by.rogatko.alx.services.UserService;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.persistence.GeneratedValue;
@SessionAttributes("userId")
@Controller
public class SearchUserPageController {

    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String id;
    @Autowired
    private UserService userService;
    public SearchUserPageController(UserService userService){
        this.userService=userService;
    }
    @GetMapping("/search_user_page")
    public String showUserSearchPage( Model model){
model.addAttribute("id",id);
        return "search_user_page";
    }
    /*
    @PostMapping("/my_main_page/id/")
            public String returnToMyPage(){
        System.out.println("Id otladka"+id);
        return "/my_main_page"+id;

            }
            */
}
