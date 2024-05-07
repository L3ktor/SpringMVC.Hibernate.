package web.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repository.UserRepository;
import web.service.UserService;

import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {
    private UserRepository uR;

    @Autowired
    public void setUserDao(UserRepository userRepository) {
        this.uR = uR;
    }
    @Override
    public void addUser(User user) {
        uR.addUser(user);
    }

    @Override
    public void deleteUserById(Long id) {
        uR.deleteUserById(id);
    }

    @Override
    public void editUser(User user) {
        uR.editUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return uR.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return uR.getAllUsers();
    }
}
