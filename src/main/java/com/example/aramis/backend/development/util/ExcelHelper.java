package com.example.aramis.backend.development.util;

/*
Author: Tanisha Ravindran
Excel utility to read user data from Excel files (.xls, .xlsx)
*/

import com.example.aramis.backend.development.model.UserInformation;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelHelper {

    // Supported MIME types
    public static String TYPE_XLSX = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
    public static String TYPE_XLS = "application/vnd.ms-excel";

    // Read Excel data and convert to the UserInformation list
    public static List<UserInformation> excelToUsers(InputStream is, String contentType) {
        try {
            Workbook workbook;

            // Choose workbook type
            if (TYPE_XLSX.equals(contentType)) {
                workbook = new XSSFWorkbook(is);
            } else if (TYPE_XLS.equals(contentType)) {
                workbook = new HSSFWorkbook(is);
            } else {
                throw new IllegalArgumentException("Unsupported file type: " + contentType);
            }

            Sheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rows = sheet.iterator();
            List<UserInformation> users = new ArrayList<>();

            int rowNumber = 0;
            while (rows.hasNext()) {
                Row currentRow = rows.next();

                // Skip header
                if (rowNumber == 0) {
                    rowNumber++;
                    continue;
                }

                Cell roleCell = currentRow.getCell(0);

                if (roleCell == null || roleCell.getCellType() != CellType.STRING) {
                    continue; // Skip invalid rows
                }

                String userRole = roleCell.getStringCellValue();

                UserInformation user = new UserInformation();
                user.setUserRole(userRole);
                user.setCreationDate(LocalDate.now());
                user.setLastChangedDate(LocalDate.now());

                users.add(user);
            }

            workbook.close();
            return users;

        } catch (Exception e) {
            throw new RuntimeException("Failed to parse Excel file: " + e.getMessage(), e);
        }
    }
}

