package by.rogatko.alx.services;

import by.rogatko.alx.repository.UserMessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageService {
    @Autowired
    private UserMessagesRepository userMessagesRepository;
}
