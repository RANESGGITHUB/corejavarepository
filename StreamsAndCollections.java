package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

import com.repo.Person;
import com.repo.PersonRepository;

public class StreamsAndCollections {
	
	public static void main(String[] args) {
		
		List<String> listStrins=new ArrayList<>();
		listStrins.add("A");
		listStrins.add("X");
		listStrins.add("C");
		listStrins.add("S");
		listStrins.add("Z");
		
		for (String string : listStrins) {
			
			//System.out.println("without streams " +  string);
		}
		
		/*
		 * Stream<String> stream=listStrins.stream(); stream.forEach(p->{
		 * //System.out.println("With sreams " + p); });
		 * 
		 * stream.forEach(p->{ //System.out.println("With sreams " + p); });
		 */
		
	List<String> name=PersonRepository.getListReposity().stream().peek(person->System.out.println(person))
			
			.map(Person::getName)
			.peek(person->System.out.println(person))
			.toList();
	
	System.out.println(name);
		
		
	}
	
	

}
