package com.itka.test.models;

import org.springframework.data.repository.CrudRepository;

import com.itka.test.models.Client;


public interface ClientRepository extends CrudRepository<Client, Long> {

}