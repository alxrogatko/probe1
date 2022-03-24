package by.rogatko.alx.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
public class User {
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String userSurname;
    @Getter
    @Setter
    private int[] userDateOfBorn;
    @Getter
    @Setter
    private int[] dateOfRegistration;
    @Getter
    @Setter
    private String userId;
    @Getter
    @Setter
    private String role;
    @Getter
    @Setter
    private String[] friendlist;
    @Getter
    @Setter
    private String[] blacklist;

}
