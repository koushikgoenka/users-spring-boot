package com.koushik.test.service;

import com.koushik.test.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public User addUser(User user);

    public List<User> getAllUsers();

    public Optional<User> getUserById(Integer id);

}
