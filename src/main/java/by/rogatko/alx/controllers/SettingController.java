package by.rogatko.alx.controllers;

import by.rogatko.alx.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class SettingController {
    UserService userService;
    @GetMapping("/settings")
public String showSettingsPage(){
        return "settings_page";
    }
    @PostMapping("/add-avatar")
    public String addAvatar(@RequestParam("userAvatar") MultipartFile multipartFile, Model model) throws IOException {
        Path path = Paths.get("src", "main", "webapp", "user-images", multipartFile.getOriginalFilename());
        multipartFile.transferTo(path);
        userService.updatePathToAvatarById(
                "user-images/" + multipartFile.getOriginalFilename(),
                String.valueOf(model.getAttribute("userId")));
        return "settings_page";
    }
}
