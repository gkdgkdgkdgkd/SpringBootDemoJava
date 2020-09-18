package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.MessagingException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

@SpringBootTest
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
class DemoApplicationTests {
	private final MailService service;

	@Test
	void contextLoads() throws URISyntaxException, MessagingException {
		service.sendSimpleMail("xxx@xxx.com","这是主题","这是内容");
		service.sendAttachmentMail("xxxx@xxx.com","这是主题","这是内容", Path.of(Objects.requireNonNull(getClass().getClassLoader().getResource("pic/1.jpg")).toURI()));
		service.sendAttachmentMail("xxx@xxx.com","这是主题","这是内容", Path.of("/","home","xxx","Desktop","1.jpg"));
	}
}
