package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.repo.Person;
import com.repo.PersonRepository;

public class StreamAllmatch {
	
	
	
	static Predicate<String> predicate=(str)->str.length()>3;
	
	
	
	public static Optional<Person> findAny()
	{
		return PersonRepository.getListReposity().stream().filter(person->person.getName().length()==6).
				
				findAny();
	}
	
	public static Optional<Person> findFirst()
	{
		return PersonRepository.getListReposity().stream().findFirst();
	}
	
	public static void main(String[] args) {
		
		
		List<String> listStrings=Arrays.asList("ABC","bbc","ccds","dfdsfds","rtc");
		
		//System.out.println("Anymatch " + listStrings.stream().anyMatch(predicate));
		
		//System.out.println("Allmatch "+ listStrings.stream().allMatch(predicate));
		
		//System.out.println(StreamAllmatch.findAny());
		
		System.out.println(findFirst());
		
		
		
	}

}
