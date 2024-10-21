package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.example.demo.mailService.JavaMailerService;

@SpringBootApplication
public class JavaMailerApplication {
	
	@Autowired
	private JavaMailerService jm;

	public static void main(String[] args) {
		SpringApplication.run(JavaMailerApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void send() {
		jm.sendMail("divs9345@gmail.com", "testmail", "Testing content for mail-java mailer project");
		
	}

}
