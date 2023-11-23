package com.feasthub.feasthub.sevices;

import java.util.List;
import org.springframework.stereotype.Service;

import com.feasthub.feasthub.repository.UserRepository;
import com.feasthub.feasthub.entity.User;

@Service
public class UserService {
    private final UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}