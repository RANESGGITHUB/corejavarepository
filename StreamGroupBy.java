package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.repo.Person;
import com.repo.PersonRepository;

public class StreamGroupBy {

	public static void getGroupByGender() {
		Map<String, List<Person>> map = PersonRepository.getListReposity().stream()
				.collect(Collectors.groupingBy(Person::getGender));

		//map.entrySet().forEach(person -> System.out.println(" key " + person.getKey() + " Value " + person.getValue()));
		Stream.of(map).forEach(System.out::println);
	}
	
	public static void getGroupByAddress()
	{
		Map<String, List<Person>> map = PersonRepository.getListReposity().stream().collect(Collectors.groupingBy(person->person.getAddress()));
		Stream.of(map).forEach(System.out::println);
	}
	
	public static void getBroupbythreeParameters()
	{
		Map<String, List<Person>> mapData=PersonRepository.getListReposity().stream().collect(Collectors.groupingBy(Person::getName,HashMap::new,Collectors.toList()));
		Stream.of(mapData).forEach(System.out::println);
	}

	public static void main(String[] args) {

		//getGroupByGender();
		//getGroupByAddress();
		getBroupbythreeParameters();
	}

}
