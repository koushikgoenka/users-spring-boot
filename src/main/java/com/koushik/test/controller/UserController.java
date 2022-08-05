package com.koushik.test.controller;

import com.koushik.test.model.User;
import com.koushik.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public User createUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/users/{id}")
    public Optional<User> findUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
}
