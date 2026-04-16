package com.test;

import java.util.List;

import com.repo.Person;
import com.repo.PersonRepository;

public class StreamMapping {
	
	
	public static List<String> getAllPersonNames()
	{
		return PersonRepository.getListReposity().stream().map(Person::getName).toList();
	}
	
	public static void main(String[] args) {
		
		getAllPersonNames().forEach(System.out::println);
		
	}

}
