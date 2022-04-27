package by.rogatko.alx.repository;

import by.rogatko.alx.entity.UserPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PhotoAlbumRepository extends JpaRepository<UserPhoto, String> {
}
