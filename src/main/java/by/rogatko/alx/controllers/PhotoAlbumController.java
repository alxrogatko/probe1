package by.rogatko.alx.controllers;

import by.rogatko.alx.services.PhotoAlbumService;
import by.rogatko.alx.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
@SessionAttributes("userId")

public class PhotoAlbumController {
    @Autowired
    UserService userService;
    @Autowired
    PhotoAlbumService photoAlbumService;

    @GetMapping("/photo_album_page/id/{id}")
    public String showPhotoAlbumPage(@PathVariable("id") String id, Model model) {
        model.addAttribute("holderName", userService.getNameById(id));
        model.addAttribute("holderSurname", userService.getSurnameById(id));

        return "photo_album_page";
    }
@PostMapping("/add_photo")
    public String addPhoto(@RequestParam("image")MultipartFile multipartFile, Model model) throws IOException {
    Path path = Paths.get("src", "main", "webapp", "pictures","users_photoalbums", multipartFile.getOriginalFilename());
    multipartFile.transferTo(path);
photoAlbumService.save(multipartFile.getOriginalFilename(),(String)model.getAttribute("userId"),path.toString());
String id=(String)model.getAttribute("userId" );
        return "redirect:/photo_album_page/id/"+id;
}

}
