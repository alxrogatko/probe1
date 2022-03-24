package by.rogatko.alx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {

private String data;//заглушка

    @GetMapping("/main")
    public String goMainPage(Model model){
model.addAttribute("data",data);

        return "main_page";
    }
}
