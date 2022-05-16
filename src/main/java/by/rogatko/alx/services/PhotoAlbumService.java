package by.rogatko.alx.services;

import by.rogatko.alx.entity.UserPhoto;
import by.rogatko.alx.repository.PhotoAlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoAlbumService {
    @Autowired
    private PhotoAlbumRepository photoAlbumRepository;

    private void save(UserPhoto userPhoto) {
        photoAlbumRepository.save(userPhoto);
    }

    public void save(String nameOfPhoto, String holderId, String pathOfPhoto) {
        UserPhoto userPhoto = new UserPhoto(pathOfPhoto, nameOfPhoto, holderId);
        save(userPhoto);

    }
}
