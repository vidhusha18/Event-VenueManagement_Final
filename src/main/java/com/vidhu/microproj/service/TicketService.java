package com.vidhu.microproj.service;



import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import org.springframework.stereotype.Service;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class TicketService {

    public byte[] generateTicket(String username, String phoneNumber, String eventDetails) throws DocumentException, IOException {
        Document document = new Document();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfWriter.getInstance(document, baos);
        document.open();
        document.add(new Paragraph("Ticket Details"));
        document.add(new Paragraph("Username: " + username));
        document.add(new Paragraph("Phone Number: " + phoneNumber));
        document.add(new Paragraph("Event Details: " + eventDetails));
        document.close();
        return baos.toByteArray();
    }
}
