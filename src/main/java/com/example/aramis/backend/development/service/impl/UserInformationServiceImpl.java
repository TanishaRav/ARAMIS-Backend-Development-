package com.example.aramis.backend.development.service.impl;

/*
Author: Tanisha Ravindran
Alstom Intern
Created for educational purposes

This class implements business logic for managing user data, including CRUD operations
and importing users from Excel files.
*/

import com.example.aramis.backend.development.model.UserInformation;
import com.example.aramis.backend.development.repository.UserInformationRepository;
import com.example.aramis.backend.development.service.UserInformationService;
import com.example.aramis.backend.development.util.ExcelHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserInformationServiceImpl implements UserInformationService {

    @Autowired
    private UserInformationRepository userInformationRepository;

    // CREATE
    @Override
    public UserInformation createUser(UserInformation userInfo) {
        userInfo.setCreationDate(LocalDate.now());
        userInfo.setLastChangedDate(LocalDate.now());
        return userInformationRepository.save(userInfo);
    }

    // READ (All Users)
    @Override
    public List<UserInformation> getAllUsers() {
        return userInformationRepository.findAll();
    }

    // READ (One User)
    @Override
    public Optional<UserInformation> getUserById(UUID id) {
        return userInformationRepository.findById(id);
    }

    // UPDATE
    @Override
    public UserInformation updateUser(UUID id, UserInformation userInfo) {
        Optional<UserInformation> optionalUser = userInformationRepository.findById(id);
        if (optionalUser.isPresent()) {
            UserInformation user = optionalUser.get();
            user.setUserRole(userInfo.getUserRole());
            user.setLastChangedDate(LocalDate.now());
            return userInformationRepository.save(user);
        }
        return null;
    }

    // DELETE
    @Override
    public void deleteUser(UUID id) {
        userInformationRepository.deleteById(id);
    }

    // IMPORT USERS FROM EXCEL
    @Override
    public void importUsersFromExcel(MultipartFile file) {
        try {
            String contentType = file.getContentType();
            List<UserInformation> users = ExcelHelper.excelToUsers(file.getInputStream(), contentType);
            userInformationRepository.saveAll(users);
        } catch (IOException e) {
            throw new RuntimeException("Failed to store Excel data: " + e.getMessage());
        }
    }
}


