package by.rogatko.alx.services;


import by.rogatko.alx.entity.Message;
import by.rogatko.alx.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MessageService {



    @Autowired
    private MessageRepository messageRepository;

    public void save(String senderId, String recipientId, Date date, String text){
        Message message = new Message() ;
        message.setRead(false);
        message.setRecipientId(recipientId);
        message.setDate(date);
        message.setSenderId(senderId);
    }

private void save(Message message){
messageRepository.save(message);


}




}
