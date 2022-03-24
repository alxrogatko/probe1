package by.rogatko.alx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/")
    public String goToLoginPage(){

        return "login_page";
    }

}
