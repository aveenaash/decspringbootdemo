package com.abc.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dtos.ClientDto;
import com.abc.entities.ClientEntity;
import com.abc.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	public void saveCleint(ClientDto dto) {
		ClientEntity centity = new ClientEntity();
		centity.setName(dto.getName());
		centity.setDomain(dto.getDomain());
		centity.setUrl(dto.getUrl());
		centity.setSecretKey(dto.getKey());
		
		clientRepository.save(centity);
	}

}
