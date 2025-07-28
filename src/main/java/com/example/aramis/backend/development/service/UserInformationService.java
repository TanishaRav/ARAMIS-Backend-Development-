package com.example.aramis.backend.development.service;

import com.example.aramis.backend.development.model.UserInformation;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserInformationService {

    UserInformation createUser(UserInformation userInfo);

    List<UserInformation> getAllUsers();

    Optional<UserInformation> getUserById(UUID id);

    UserInformation updateUser(UUID id, UserInformation userInfo);

    void deleteUser(UUID id);

    // IMPORT USERS FROM EXCEL
    void importUsersFromExcel(MultipartFile file);
}

