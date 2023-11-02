package ua.tquintas.restmysql;

import java.util.List;

public interface UserService {
    User createUser(User user);

    User getUserById(Long userId) throws Exception;

    List<User> getAllUsers();

    User updateUser(User user) throws Exception;

    void deleteUser(Long userId);
}
