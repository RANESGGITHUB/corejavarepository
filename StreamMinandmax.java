package com.test;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.repo.Person;
import com.repo.PersonRepository;

public class StreamMinandmax {
	
	
	public static Optional<Person> getHighSalaryPerson()
	{
		
		return PersonRepository.getListReposity().stream().collect(Collectors.maxBy(Comparator.comparing(Person::getSalary)));
	}
	
	
	public static void main(String[] args) {
		
		
		
		System.out.println(PersonRepository.getListReposity().stream().
				collect(Collectors.maxBy(Comparator.comparing(Person::getSalary))));
		
		
		Optional<Person> person=getHighSalaryPerson();
		
		if(person.isPresent())
		{
			System.out.println(person.get());
		}
		
	}

}
