package com.example.aramis.backend.development.controller;

/*
Author: Tanisha Ravindran
Alstom intern
Created for educational purposes
 */

import com.example.aramis.backend.development.model.UserInformation;
import com.example.aramis.backend.development.repository.UserInformationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserInformationController {

    @Autowired
    private UserInformationRepository userInformationRepository;

    // GET all users
    @GetMapping
    public List<UserInformation> getAllUsers() {
        return userInformationRepository.findAll();
    }

    // GET one user by ID
    @GetMapping("/{id}")
    public Optional<UserInformation> getUserById(@PathVariable String id) {
        return userInformationRepository.findById(id);
    }

    // POST new user
    @PostMapping
    public UserInformation createUser(@RequestBody UserInformation userInfo) {
        return userInformationRepository.save(userInfo);
    }

    // PUT update user
    @PutMapping("/{id}")
    public UserInformation updateUser(@PathVariable String id, @RequestBody UserInformation userInfo) {
        userInfo.setUserId(id);
        return userInformationRepository.save(userInfo);
    }

    // DELETE user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userInformationRepository.deleteById(id);
    }
}

