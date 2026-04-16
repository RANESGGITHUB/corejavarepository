package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.repo.Person;
import com.repo.PersonRepository;

public class BiFunctionTest {
	
	static BiFunction<String, String, String> biFunctionTest=(a,b)->{
		
		return a +" "+b;
	};
	static Predicate<Person> predicteGender=(person)->person.getName().equals("ramesh2");
	static Predicate<Person> prdicatePerson=(strGender->strGender.equals("M"));
	static BiFunction<List<Person>, Predicate<Person>, Map<String, List<String>>> mapBicaiton=(personList,predicatePerson)->
	{
		
		Map<String, List<String>> mapdata=new HashMap<String, List<String>>();
		
		personList.forEach(person->{
			if(predicteGender.and(predicatePerson).test(person))
			{
				mapdata.put(person.getName(), person.getHobbies());
			}
		});
		return mapdata;
		
	};
	
	
	public static void main(String[] args) {
		
		//System.out.println(biFunctionTest.apply("java ", "jdk"));
		
		List<Person> listpersons=PersonRepository.getListReposity();
		System.out.println(mapBicaiton.apply(listpersons, prdicatePerson));
		
	}

}
