package by.rogatko.alx.controllers;

import by.rogatko.alx.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("userId")

public class PhotoAlbumController {
    @Autowired
    UserService userService;

    @GetMapping("/photo_album_page/id/{id}")
    public String showPhotoAlbumPage(@PathVariable("id") String id, Model model) {
        model.addAttribute("holderName", userService.getNameById(id));
        model.addAttribute("holderSurname", userService.getSurnameById(id));
        return "photo_album_page";
    }


}
