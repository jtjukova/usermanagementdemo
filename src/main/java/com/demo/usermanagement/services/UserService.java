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

    public Optional<User> getUserById(Integer id) {
        return userRepository.findById(id);
    }

    public User saveProduct(User product) {
        return userRepository.save(product);
    }

    public void deleteProduct(Integer id) {
        userRepository.deleteById(id);
    }

}
