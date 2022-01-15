package com.jrbangit.jbangonlinecleaners.Services;

import com.jrbangit.jbangonlinecleaners.Models.User;
import com.jrbangit.jbangonlinecleaners.Respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterUserService {

    private UserRepository userRepository;

    @Autowired
    public RegisterUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User registerUser(User user){
        return userRepository.save(user);
    }
}
