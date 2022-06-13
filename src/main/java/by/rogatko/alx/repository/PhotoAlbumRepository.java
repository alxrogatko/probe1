package by.rogatko.alx.repository;

import by.rogatko.alx.entity.UserPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PhotoAlbumRepository extends JpaRepository<UserPhoto, String> {
    @Query("from UserPhoto where holderId=:holderId")
        List<UserPhoto> findUserPhotoByHolderId(@Param("holderId")String holderId);


   //@Query ("from UserPhoto where pathOfPhoto=:pathOfPhoto")
     void deleteUserPhotoByPathOfPhoto(@Param("pathOfPhoto")String pathOfPhoto);


}
