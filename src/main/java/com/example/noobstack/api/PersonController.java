package com.example.noobstack.api;

import com.example.noobstack.model.Person;
import com.example.noobstack.service.PersonService;

public class PersonController {
	
	private final PersonService personService;

	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	public void adddPerson(Person person) {
		personService.addPerson(person);
	}

}
