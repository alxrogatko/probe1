package by.rogatko.alx.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("UserId")
public class RegistrationController {
@GetMapping("/registration")
    public String showRegistrationPage(){
    return "/registration_page";
}
@PostMapping("/registration")
    public String checkInvite(
            @RequestParam("name")String userName,
            @RequestParam("surname") String userSurname,
            @RequestParam("inviteCode")String code,
          Model model


){System.out.print(userName+" username \n" + userSurname + " surname \n"+code+" code");
return "login_page";//заглушка
}

}
