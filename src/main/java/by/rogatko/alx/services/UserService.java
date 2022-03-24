package by.rogatko.alx.services;

import by.rogatko.alx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void saveUser(String username, String userSurname, String userDateOfBorn, String userDateOfRegistration, String role){


    }
    public void updatePathToAvatarById(String path, String id){

    }
}
