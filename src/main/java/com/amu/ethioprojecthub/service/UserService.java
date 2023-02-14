package com.amu.ethioprojecthub.service;

import com.amu.ethioprojecthub.model.User;
import com.amu.ethioprojecthub.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService() throws SQLException {
        this.userRepository = new UserRepository();
    }

    public User findByEmail(String username) {
        return userRepository.getUserByEmail(username);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    public void register(User user) {
        userRepository.addUser(user);
    }

    public void update(User user) {
        userRepository.updateUser(user);
    }

    public void delete(String id) {
        userRepository.deleteUser(id);
    }
}
