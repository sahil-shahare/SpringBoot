package com.Spring.Cashing.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
@Service
public class MailSenderService {
	
	@Autowired
	JavaMailSender sender;
	
	public String sendMail(String usermail) {
		SimpleMailMessage msg = new SimpleMailMessage();
		msg.setTo(usermail);
		msg.setFrom("sahilpvt380@gmail.com");
		msg.setSubject("Placement update");
		msg.setText("Hi Placement Officer here");
		
		sender.send(msg);
		
		return "mail send: ";
	}

}
