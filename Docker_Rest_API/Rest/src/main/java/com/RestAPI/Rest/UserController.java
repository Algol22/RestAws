package com.RestAPI.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String welcome(){
        return "hello world";
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepo.findAll();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userRepo.save(user);
    }
}
