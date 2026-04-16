package com.test;

import java.util.Comparator;
import java.util.stream.Collectors;

import com.repo.Person;
import com.repo.PersonRepository;

public class StreamCustomSorting {
	
	public static void main(String[] args) {
		
		
		Comparator<Person> comparator=(person1, person2)->{
			
			return person1.getName().compareTo(person2.getName());
			
		};
		//System.out.println(PersonRepository.getListReposity().stream().sorted(comparator).collect(Collectors.toList()));
		System.out.println(PersonRepository.getListReposity().stream().sorted(Comparator.comparing(Person::getName).reversed())
				.collect(Collectors.toList()));
	}

}
