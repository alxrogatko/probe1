package by.rogatko.alx.controllers;


import by.rogatko.alx.entity.Message;
import by.rogatko.alx.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;

@Controller
@SessionAttributes("userId")
public class MessageController {


    @Autowired
    private MessageRepository messageRepository;
    Message message = new Message();

    public void sendMessage(String senderId,
                            String recipientId,
                            String textOfMessage
    ) {

        message.setSenderId(senderId);
        message.setRecipientId(recipientId);
        message.setTextOfMessage(textOfMessage);
        message.setReadMessage(false);
        Date date = new Date();
        message.setDateOfSent(date);
    }

    private void sendMessage(Message message) {
        messageRepository.save(message);

    }
}



