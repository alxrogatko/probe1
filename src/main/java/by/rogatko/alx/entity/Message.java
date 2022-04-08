package by.rogatko.alx.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
public class Message {
    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
private String id;

    @Setter
    private String senderId;
    @Setter
    private String recipientId;
    @Setter
    private Date dateOfSent;
    @Setter
    private String textOfMessage;
    @Setter
    private boolean readMessage;





}
