package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);

    void deleteUserById(Long id);

    void editUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();

}
