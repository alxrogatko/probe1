package by.rogatko.alx.repository;

import by.rogatko.alx.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface MessageRepository extends JpaRepository<Message, String> {
}
