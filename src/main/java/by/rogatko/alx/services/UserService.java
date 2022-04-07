package by.rogatko.alx.services;

import by.rogatko.alx.entity.User;
import by.rogatko.alx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public void save(String name, String surname, String password, String login){

 User user = new User();
    user.setName(name);
    user.setSurname(surname);
    user.setPassword(password);
    user.setLogin(login);
    save(user);
    }
    private void save(User user){
        userRepository.save(user);
    }

public Optional<User> findUserByLogin(String login) {
    return userRepository.findUserByLogin(login);

}
}

