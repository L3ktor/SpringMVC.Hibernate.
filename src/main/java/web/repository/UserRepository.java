package web.repository;

import web.model.User;

import java.util.List;

public interface UserRepository {
    void addUser(User user);

    void deleteUserById(Long id);

    void editUser(User user);

    User getUserById(Long id);

    List<User> getAllUsers();
}
