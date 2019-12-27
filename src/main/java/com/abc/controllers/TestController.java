package com.abc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abc.dtos.NotificationDto;

import com.abc.services.NotificationService;

@RestController
@RequestMapping("/notification")
public class TestController {

	@Autowired
	private NotificationService notificationService;
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public String showTest(@RequestBody NotificationDto body) {
		notificationService.notifyMe(body);
		return "test";
	}
}
