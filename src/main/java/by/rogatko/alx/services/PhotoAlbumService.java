package by.rogatko.alx.services;

import by.rogatko.alx.entity.UserPhoto;
import by.rogatko.alx.repository.PhotoAlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public List<String> getPathPhotoByUserId(String holderId) {
        List<UserPhoto> userPhotos = photoAlbumRepository.findUserPhotoByHolderId(holderId);
        List<String> pathesOfPhoto = new ArrayList<>();
        for (int i = 0; i < userPhotos.size(); i++) {
            pathesOfPhoto.add(userPhotos.get(i).getPathOfPhoto());
        }
        return pathesOfPhoto;
    }

    public void deletePhotoByPath(String pathOfPhoto) {

        photoAlbumRepository.deleteUserPhotoByPathOfPhoto(pathOfPhoto);

    }
}

