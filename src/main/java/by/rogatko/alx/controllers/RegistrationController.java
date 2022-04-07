package by.rogatko.alx.controllers;

import by.rogatko.alx.entity.User;
import by.rogatko.alx.services.UserService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("UserId")
public class RegistrationController {
    private UserService userService;

    @Autowired
    public RegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String showRegistrationPage() {
        return "/registration_page";
    }

    @PostMapping("/registration")
    public String registrationNewUser(
            @RequestParam("name") String userName,
            @RequestParam("surname") String userSurname,
            @RequestParam("login") String login,
            @RequestParam("password") String password,
            @RequestParam("repassword") String repassword
            , Model model


    ) {


        if (!password.equals(repassword)) {
            model.addAttribute("message", "Проверьте правильность пароля/ повтора пароля");
            return "registration_page";
        } else if (userService.findUserByLogin(login).isPresent()

        ) {
            model.addAttribute("message", "Логин занят, выберите другой");
            return "registration_page";
        } else {userService.save(userName, userSurname, password, login);
                   return "login_page";

        }
    }

}
