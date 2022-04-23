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

@SessionAttributes("userId")
@Controller
public class UserPageController {
    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String id;
    public String targetUserId;
    public UserPageController(UserService userService){
      this.userService=userService;

    }

    @Autowired
    private UserService userService;
    @GetMapping("/user_page/id/{id}")
    public String showUserPage(@PathVariable("id")String id, Model model){

        return "user_page";
    }
}
