package by.rogatko.alx.repository;

import by.rogatko.alx.entity.Message;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public interface MessageRepository extends JpaRepository<Message, String> {
    @Query("from Message where senderId =:senderId")
    List<Message> findMessageBySenderId(@Param("senderId") String senderId);

    @Query("from Message where recipientId =:recipientId")
    List<Message> findMessageByRecipientId(@Param("recipientId") String recipientId);
}
