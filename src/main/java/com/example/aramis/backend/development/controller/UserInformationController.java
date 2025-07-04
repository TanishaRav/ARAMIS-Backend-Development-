package com.example.aramis.backend.development.controller;

/*
Author: Tanisha Ravindran
Alstom intern
Created for educational purposes
 */

import com.example.aramis.backend.development.model.UserInformation;
import com.example.aramis.backend.development.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/users")
public class UserInformationController {

    @Autowired
    private UserInformationService userInformationService;

    // GET all users
    @GetMapping
    public List<UserInformation> getAllUsers() {
        return userInformationService.getAllUsers();
    }

    // GET one user by ID
    @GetMapping("/{id}")
    public Optional<UserInformation> getUserById(@PathVariable UUID id) {
        return userInformationService.getUserById(id);
    }

    // POST new user
    @PostMapping
    public UserInformation createUser(@RequestBody UserInformation userInfo) {
        return userInformationService.createUser(userInfo);
    }

    // PUT update user
    @PutMapping("/{id}")
    public UserInformation updateUser(@PathVariable UUID id, @RequestBody UserInformation userInfo) {
        return userInformationService.updateUser(id, userInfo);
    }

    // DELETE user
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable UUID id) {
        userInformationService.deleteUser(id);
    }
}

