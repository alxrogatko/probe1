package by.rogatko.alx.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class UserPhoto {
    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String id;
    @Getter
    @Setter
    private String pathOfPhoto;//путь к фотографии
    @Getter
    @Setter
    private String nameOfPhoto;//имя файла фото
    @Getter
    @Setter
    private String dateOfPhoto;//дата загрузки фото
    @Getter
    @Setter
    private String holderId;// id владельца фото

    @Getter
    @Setter
    private String titlePhoto;//название фото


    public UserPhoto() {
    }

    public UserPhoto(String pathOfPhoto, String nameOfPhoto, String holderId) {
        this.pathOfPhoto = pathOfPhoto;

        this.holderId = holderId;
        Date date = new Date();

        dateOfPhoto = String.valueOf(date);
        this.nameOfPhoto = nameOfPhoto;
        System.out.println(dateOfPhoto);
    }

}
