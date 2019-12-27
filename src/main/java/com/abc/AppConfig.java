package com.abc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.abc.services.EmailService;
import com.abc.services.NotificationService;
import com.abc.services.TextService;

@Configuration
public class AppConfig {

	@Bean
	public EmailService emailService() {
		return new EmailService();
	}
	
	@Bean
	public TextService textService() {
		return new TextService();
	}
	
	@Bean
	public NotificationService notification() {
		NotificationService ns = new NotificationService();
		ns.setEmailService(emailService());
		ns.setTextService(textService());
		return ns;
	}
	
	
	
}
