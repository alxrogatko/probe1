package by.rogatko.alx.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface PathToPhotoAlbumRepository extends JpaRepository {
}
