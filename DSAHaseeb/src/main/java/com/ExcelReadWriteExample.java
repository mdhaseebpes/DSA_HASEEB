package com;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelReadWriteExample {
    public static void main(String[] args) {
        String filePath = "path/to/excel/file.xlsx";

        try (Workbook workbook = new XSSFWorkbook(new FileInputStream(filePath))) {
            // Read data from the Excel file
            Sheet sheet = workbook.getSheetAt(0); // Assuming the first sheet
            for (Row row : sheet) {
                for (Cell cell : row) {
                    CellType cellType = cell.getCellType();
                    if (cellType == CellType.STRING) {
                        String value = cell.getStringCellValue();
                        System.out.print(value + "\t");
                    } else if (cellType == CellType.NUMERIC) {
                        double value = cell.getNumericCellValue();
                        System.out.print(value + "\t");
                    }
                }
                System.out.println();
            }

            // Write data to the Excel file
            Sheet newSheet = workbook.createSheet("New Sheet");
            Row newRow = newSheet.createRow(0);
            Cell newCell = newRow.createCell(0);
            newCell.setCellValue("Hello, World!");

            try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                workbook.write(outputStream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

