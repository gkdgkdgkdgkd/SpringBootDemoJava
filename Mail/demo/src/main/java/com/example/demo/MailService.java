package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.MessagingException;
import java.nio.file.Path;

public interface MailService {
    void sendSimpleMail(String to,String subject,String content);

    void sendAttachmentMail(String to, String subject, String content, Path file) throws MessagingException;
}
