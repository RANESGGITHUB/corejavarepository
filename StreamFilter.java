package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.repo.Person;
import com.repo.PersonRepository;

public class StreamFilter {
	
	
	static Predicate<Person> perdicatePerson=(person)->person.getGender().equalsIgnoreCase("M");
	
	
	public static void main(String[] args) {
		
		
		List<String> listStrings=Arrays.asList("ABC","bbc","ccds","dfdsfds","rtc");
		
		List<String> listStringslength=listStrings.stream().filter(str->str.length()>=3).collect(Collectors.toList());
		
		listStringslength.forEach(System.out::println);
		
		PersonRepository.getListReposity().stream().filter(perdicatePerson)
		.collect(Collectors.toList()).forEach(System.out::println);;
	}

}
