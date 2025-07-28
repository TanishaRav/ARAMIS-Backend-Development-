package com.example.aramis.backend.development.service.impl;

import com.example.aramis.backend.development.model.UserInformation;
import com.example.aramis.backend.development.repository.UserInformationRepository;
import com.example.aramis.backend.development.service.ExcelService;
import com.example.aramis.backend.development.util.ExcelHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

@Service
public class ExcelServiceImpl implements ExcelService {

    @Autowired
    private UserInformationRepository userRepo;

    @Override
    public void importUsersFromExcel(MultipartFile file) {
        try {
            InputStream is = file.getInputStream();
            String contentType = file.getContentType();
            List<UserInformation> users = ExcelHelper.excelToUsers(is, contentType);
            userRepo.saveAll(users);
        } catch (Exception e) {
            throw new RuntimeException("Failed to store Excel data: " + e.getMessage());
        }
    }
}
