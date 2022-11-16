package com.makeplace.api.service;

import com.makeplace.api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonService {

    @Autowired
    PersonRepository personRepository;

    public void blablabla(){
        personRepository.findAll();
    }
}
