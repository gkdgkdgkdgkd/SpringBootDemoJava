package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.MessagingException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.util.Objects;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class DemoApplicationTests {
    private final MailService sender;

    @Test
    void testSender() throws URISyntaxException, MessagingException {
        sender.sendSimpleMail("xxxxxx@xxxx.com","这是主题","这是内容");
        sender.sendAttachmentMail("xxxxxx@xxx.com","这是主题","这是内容", Path.of(Objects.requireNonNull(getClass().getClassLoader().getResource("pic/1.jpg")).toURI()));
    }

}
