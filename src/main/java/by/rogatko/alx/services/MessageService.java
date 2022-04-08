package by.rogatko.alx.services;


import by.rogatko.alx.entity.Message;
import by.rogatko.alx.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class MessageService {



    @Autowired
    private MessageRepository messageRepository;

    public void save(String senderId, String recipientId, Date date, String text){
        Message message = new Message() ;
        message.setReadMessage(false);
        message.setRecipientId(recipientId);
        message.setDateOfSent(date);
        message.setSenderId(senderId);
    }

private void save(Message message){
messageRepository.save(message);


}
public List<Message> getMessageBySenderId(String senderId){
     return   messageRepository.findMessageBySenderId(senderId);


}

    public List<Message> getMessageByRecipientId(String recipientId){
        return   messageRepository.findMessageByRecipientId(recipientId);


    }

}
