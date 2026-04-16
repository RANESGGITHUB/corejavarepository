package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

import com.repo.Person;
import com.repo.PersonRepository;

public class FunctionTest {
	
	static Function<String,String> uppercaseFucntion=(name->name.toUpperCase());
	static Function<String,String> concatFucntion=(name->name.concat(" new version is 25"));
	static Function<String, Integer> integerFunction=(strName->strName.length());
	static Predicate<Person> predicatePerson=(person->person.getName().equalsIgnoreCase("ramesh1"));
	static Function<List<Person>, Map<String, List<String>>> listMapfunction=(personList->
	
	{
		Map<String, List<String>> map=new HashMap<String, List<String>>();
		personList.forEach(person->{
			if(predicatePerson.test(person))
			map.put(person.getName(), person.getHobbies());
		});
		return map;
	});
	
	public static void main(String[] args) {
		
		//System.out.println(uppercaseFucntion.apply("java"));
		//System.out.println(concatFucntion.apply("java"));
		
		//System.out.println(uppercaseFucntion.andThen(concatFucntion).apply("java"));
		//System.out.println(uppercaseFucntion.compose(concatFucntion).apply("java"));
		
		//System.out.println(integerFunction.apply("RAMESH"));
		List<Person>  list=PersonRepository.getListReposity();
		
		System.out.println(listMapfunction.apply(list));
	}

}
