package com.jrbangit.jbangonlinecleaners.Controllers;

import com.jrbangit.jbangonlinecleaners.Models.User;
import com.jrbangit.jbangonlinecleaners.Services.RegisterUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class RegisterUserController {

    private RegisterUserService registerUserService;

    @Autowired
    public RegisterUserController(RegisterUserService registerUserService){
        this.registerUserService = registerUserService;
    }

    @PostMapping("register")
    public ResponseEntity<User> registerUser(@RequestBody User user){
        return new ResponseEntity<>(registerUserService.registerUser(user), HttpStatus.ACCEPTED);
    }
}
