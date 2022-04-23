package by.rogatko.alx.services;

import by.rogatko.alx.entity.User;
import by.rogatko.alx.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
public User getUserById(String id){return userRepository.getById(id);

}
public String getPasswordByLogin(String login){
        Optional<User> user = userRepository.findUserByLogin(login);
    return user.get().getPassword();
}
public String getIdByLogin(String login){
      Optional<User> user = userRepository.findUserByLogin(login);
      return user.get().getId();


}
public String getLoginById(String id){
        String login = userRepository.findUserById(id).get().getLogin();
        return login;
}
public List<User> getUserBySurname(String surname){
        List<User> users= new ArrayList<User>();
   users=userRepository.findUserBySurname(surname)  ;
    return users;
}
}

