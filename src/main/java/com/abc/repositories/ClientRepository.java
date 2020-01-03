package com.abc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abc.entities.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

	public ClientEntity findByNameAndActiveTrue(String name);
	
	public List<ClientEntity> findAll();
	
	public List<ClientEntity> findByDomainAndActive(String domain);
}
