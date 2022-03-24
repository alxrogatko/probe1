package by.rogatko.alx.repository;

import by.rogatko.alx.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMessagesRepository extends JpaRepository<Message,String> {
}
