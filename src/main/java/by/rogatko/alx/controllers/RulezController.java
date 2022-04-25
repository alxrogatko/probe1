package by.rogatko.alx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RulezController {
    @GetMapping("/rulez")
    public String showRulezPage() {
        return "rulez_page";

    }
}
