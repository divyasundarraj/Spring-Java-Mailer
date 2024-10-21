package com.example.demo.mailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class JavaMailerService {
	
	@Autowired
	private JavaMailSender jms;
	
	public void sendMail(String to, String subject, String body) {
		
		SimpleMailMessage sms = new SimpleMailMessage();
		sms.setTo(to);
		sms.setSubject(subject);
		sms.setText(body);
		
		jms.send(sms);
		System.out.println("Mail Sent Succesfully");
		
	}

}
