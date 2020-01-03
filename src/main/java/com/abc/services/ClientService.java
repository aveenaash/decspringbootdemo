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
	
	public ClientDto getCleint(String name) {
		ClientEntity ent = clientRepository.findByNameAndActiveTrue(name);
		return convert(ent);
	}
	
	public ClientDto convert(ClientEntity ce) {
		ClientDto dto = null;
		if(ce != null) {
			dto = new ClientDto();
			dto.setId(ce.getId());
			dto.setName(ce.getName());
			dto.setUrl(ce.getUrl());
			dto.setKey(ce.getSecretKey());
			dto.setDomain(ce.getDomain());
		}
		
		return dto;
	}

}
