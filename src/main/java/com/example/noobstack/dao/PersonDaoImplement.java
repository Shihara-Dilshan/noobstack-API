package com.example.noobstack.dao;

import java.util.ArrayList;
import java.util.List;

import com.example.noobstack.model.Person;

public class PersonDaoImplement implements PersonDao {

	private static List<Person> DB = new ArrayList<>();
	
	@Override
	public int insertPerson(Person person) {
		DB.add(person);
		
		return 1;
	}

	

}
