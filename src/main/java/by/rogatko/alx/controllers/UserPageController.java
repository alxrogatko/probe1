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

    private String userId;

    //public String targetUserId;
    public UserPageController(UserService userService) {
        this.userService = userService;

    }

    @Autowired
    private UserService userService;

    @GetMapping("/user_page/id/{id}/q/{ids}")
    public String showUserPage(Model model, @PathVariable("id") String id, @PathVariable("ids") String ids) {


        model.addAttribute("holderName", userService.getNameById(id));
        model.addAttribute("holderSurname", userService.getSurnameById(id));

;
//model.addAttribute("id",userId);
      //  model.addAttribute("id", ids);
        System.out.println(model.getAttribute("userId")+" Отладка userPageController");
        return "user_page";
    }
}
