package by.rogatko.alx.repository;

import by.rogatko.alx.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface FriendListRepository extends JpaRepository <User, String>{
}
