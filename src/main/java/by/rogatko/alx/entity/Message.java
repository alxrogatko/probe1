package by.rogatko.alx.entity;


import javax.persistence.Entity;


import lombok.Getter;
import lombok.Setter;
@Entity
public class Message {
    @Getter
    @Setter
    private String senderId;
    @Getter
    @Setter
    private String recipientId;
    @Getter
    @Setter
    private String messageText;
    @Getter
    @Setter
    private String dateOfMessage;
    @Getter
    @Setter
    private boolean read;
}
