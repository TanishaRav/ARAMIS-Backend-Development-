package com.example.aramis.backend.development.service;

import org.springframework.web.multipart.MultipartFile;

public interface ExcelService {
    void importUsersFromExcel(MultipartFile file);
}
