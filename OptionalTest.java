package com.test;

import java.util.Optional;

import com.repo.Person;
import com.repo.PersonRepository;

public class OptionalTest {
	
	
	public static String getName()
	{
		
	return null;
	}
	
	public static Optional<Object> processPerson(Optional<Person> onePerson)
	{
		return onePerson.isPresent() ? Optional.ofNullable(onePerson.get()): Optional.empty();
		
		
	}
	
	
	public static void orElse()
	{
		
		Optional<Person> namePerson=PersonRepository.getOnePerson();
		
		String name=namePerson.map(Person::getName).orElse("No data found");
		
		System.out.println(name);
	}
	
	
	
	public static void main(String[] args) {
		
		
		/*
		 * Optional<String> str=Optional.ofNullable(getName());
		 * 
		 * if(str.isPresent()) {
		 * 
		 * System.out.println(str.get()); }
		 * 
		 * Optional<Person> onePerson=PersonRepository.getOnePerson();
		 * 
		 * System.out.println(processPerson(onePerson));
		 */
		
		orElse();
		
	}

}
