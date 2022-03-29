package by.rogatko.alx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping({"/"})
    public String showLoginPage(){
      return "login_page";

    }
}
