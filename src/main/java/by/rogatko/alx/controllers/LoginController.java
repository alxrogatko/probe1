package by.rogatko.alx.controllers;

import by.rogatko.alx.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    private UserService userService;
    @GetMapping({"/","login_page","login"})
    public String showLoginPage(){
      return "login_page";

    }
    @PostMapping({"/login_page"})
    public String login(
            @RequestParam("login")String login,
            @RequestParam("password")String password,
            Model model


    ){

       return null;
    }
}
