package com.example.noobstack.service;

import com.example.noobstack.dao.PersonDao;
import com.example.noobstack.model.Person;

public class PersonService {
	
	private final PersonDao persondao;
	
	public PersonService(PersonDao persondao) {
		super();
		this.persondao = persondao;
	}

	public int addPerson(Person person) {
		
		return persondao.insertPerson(person);
		
	}

}
