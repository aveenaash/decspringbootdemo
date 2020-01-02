package com.abc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abc.entities.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {

}
