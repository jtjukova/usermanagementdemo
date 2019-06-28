package com.demo.usermanagement.services;

import com.demo.usermanagement.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.usermanagement.repositories.UserRepository;

import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> listAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Integer id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }

}
