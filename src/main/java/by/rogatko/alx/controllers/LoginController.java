package by.rogatko.alx.controllers;

import by.rogatko.alx.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userId")

public class LoginController {
    public LoginController(UserService userService) {
        this.userService = userService;

    }

    private UserService userService;

    @GetMapping({"/", "login_page", "login"})
    public String showLoginPage() {
        return "login_page";

    }

    @PostMapping({"/login"})
    public String login(
            @RequestParam("login") String login,
            @RequestParam("password") String password,
            Model model


    ) {
        if (
                userService.findUserByLogin(login).isPresent() &&
                        password.equals(userService.getPasswordByLogin(login))) {

            return "redirect:/my_main_page"+"/id/"+userService.getIdByLogin(login);
        } else {
            model.addAttribute("message", "Проверьте правильность введенных данных");
            return "login_page";
        }
    }
}
