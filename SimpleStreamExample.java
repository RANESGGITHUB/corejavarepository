package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.repo.Person;
import com.repo.PersonRepository;

public class SimpleStreamExample {
	
	public static void main(String[] args) {
		
		Map<String, List<String>> map=new HashMap<String, List<String>>();
		List<Person> listperson=PersonRepository.getListReposity();
		
		Function<List<Person>, Map<String, List<String>>>  function=(list)->{
			
			list.forEach(person->{
				
				map.put(person.getName(), person.getHobbies());
			});
			
			return map;
			
		};
		
		Function<Person, Map<String, List<String>>> mapreutn=(person)->{
			map.put(person.getName(), person.getHobbies());
			return map;
			
		};
		
		Predicate<Person> prdicatePerson=(person)->{
			
			if(person.getGender().equalsIgnoreCase("M"))
			{
				return true;
			}
			return false;
			
		};
Predicate<Person> prdicateAddress=(person)->{
			
			if(person.getAddress().equalsIgnoreCase("unguturu1"))
			{
				return true;
			}
			return false;
			
		};
		
		
		BiPredicate<String, String> biPredicate=(gender,address)->{
			
			if(gender.equalsIgnoreCase("M") && address.equalsIgnoreCase("unguturu1")) 
			return true;
			return false;
			
		};
		
		Map<String, List<String>> map1=listperson.stream().filter(prdicatePerson).filter(prdicateAddress)
				
				.collect(Collectors.toMap(Person::getName,Person::getHobbies));
		
		//System.out.println(map1);
		
		
		
		
		List<String> listStrings=listperson.stream()// steamms
				.map(Person::getHobbies)// stream<list<string>>
				.flatMap(List::stream)// stream<string>
				.collect(Collectors.toList());
		
		System.out.println(listStrings);
		
		
	}

}
