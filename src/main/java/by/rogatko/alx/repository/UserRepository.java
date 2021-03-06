package by.rogatko.alx.repository;

import by.rogatko.alx.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Transactional
public interface UserRepository extends JpaRepository<User, String> {
    @Query("from User where login =:login")
    Optional<User> findUserByLogin(@Param("login") String login);

    @Query("from User where surname =:surname")
    List<User> findUserBySurname(@Param("surname") String surname);

    @Query("from User where id =:id")
    Optional<User> findUserById(@Param("id") String id);
}
