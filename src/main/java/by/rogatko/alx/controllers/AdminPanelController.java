package by.rogatko.alx.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class AdminPanelController {
    @GetMapping("/admin")
    public String showAdminPanel() {

        return "admin_panel";
    }


}
