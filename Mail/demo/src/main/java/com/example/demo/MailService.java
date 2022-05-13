package com.example.demo;

import javax.mail.MessagingException;
import java.nio.file.Path;

public interface MailService {
    void sendSimpleMail(String to,String subject,String content);

    void sendAttachmentMail(String to, String subject, String content, Path file) throws MessagingException;
}
