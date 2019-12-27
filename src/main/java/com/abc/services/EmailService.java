package com.abc.services;

import org.springframework.beans.factory.annotation.Value;

public class EmailService {
	
	@Value("${notification.email.from}")
	private String from;
	@Value("${notification.email.message}")
	private String message;
	
	public void sendEmail(String to) {
		System.out.println("Sending email from : " + from);
		System.out.println("Sending email body : " + message);
		System.out.println("Sending email to : " + to);
	}

}
