/*
package com;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class PdfReadWriteExample {
    public static void main(String[] args) {
        String filePath = "path/to/pdf/file.pdf";

        try (PdfReader reader = new PdfReader(filePath);
             PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(filePath))) {

            // Read data from the PDF file
            int numPages = reader.getNumberOfPages();
            for (int i = 1; i <= numPages; i++) {
                System.out.println("Page " + i + ": " + reader.getPageContent(i));
            }

            // Write data to the PDF file
            Document document = new Document();
            PdfWriter writer = PdfWriter.getInstance(document, stamper.getWriter());
            document.open();
            document.add(new com.itextpdf.text.Paragraph("Hello, World!"));
            document.close();

        } catch (IOException | DocumentException e) {
            e.printStackTrace();
        }
    }
}
*/
