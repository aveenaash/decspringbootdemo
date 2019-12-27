package com.abc.services;

import org.springframework.beans.factory.annotation.Value;

public class TextService {
	
	@Value("${notification.text.from}")
	private String from;
	
	@Value("${notification.text.message}")
	private String message;
	
	public void sendtext(String to) {
		System.out.println("Sending text from : " + from);
		System.out.println("Sending text body : " + message);
		System.out.println("Sending text to : " + to);
	}

}
