package com.abc.services;

import com.abc.dtos.NotificationDto;

public class NotificationService {

	private EmailService emailService;

	private TextService textService;

	public void notifyMe(NotificationDto notDto) {
		if ("TEXT".equals(notDto.getType())) {
			textService.sendtext(notDto.getTo());
		} else if ("EMAIL".equals(notDto.getType())) {
			emailService.sendEmail(notDto.getTo());
		}
	}

	public EmailService getEmailService() {
		return emailService;
	}

	public void setEmailService(EmailService emailService) {
		this.emailService = emailService;
	}

	public TextService getTextService() {
		return textService;
	}

	public void setTextService(TextService textService) {
		this.textService = textService;
	}

}
