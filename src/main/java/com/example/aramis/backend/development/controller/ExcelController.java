package com.example.aramis.backend.development.controller;

import com.example.aramis.backend.development.service.ExcelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/excel")
public class ExcelController {

    @Autowired
    private ExcelService excelService;

    @PostMapping("/upload")
    public ResponseEntity<String> uploadExcelFile(@RequestParam("file") MultipartFile file) {
        String contentType = file.getContentType();

        if (contentType == null || (!contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")
                && !contentType.equals("application/vnd.ms-excel"))) {
            return ResponseEntity.badRequest().body("Invalid file type. Please upload an Excel file.");
        }

        try {
            excelService.importUsersFromExcel(file);
            return ResponseEntity.ok("Excel file uploaded and data imported successfully.");
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error importing Excel file: " + e.getMessage());
        }
    }
}
