package com.test;

import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.repo.Person;
import com.repo.PersonRepository;

public class StreamPartition {
	
	
	
	public static Predicate<Person> predicate=(person->person.getGender().equalsIgnoreCase("M"));
	
	public static void groupByPartition()
	{
		Map<Boolean, List<Person>> map=PersonRepository.getListReposity().stream().collect(partitioningBy(predicate));
		
		System.out.println(map);
	}
	
	public static void groupByPartitionset()
	{
		Map<Boolean, Set<Person>> map=PersonRepository.getListReposity().stream().collect(partitioningBy(predicate,Collectors.toSet()));
		
		System.out.println(map);
	}
	
	public static void groupByPartitionByMap()
	{
		Map<Boolean, Map<String, List<String>>> map=PersonRepository.getListReposity().stream().collect(partitioningBy
				(predicate,Collectors.toMap(Person::getName,Person::getHobbies)));
		
		System.out.println(map);
	}
	
	
	public static void main(String[] args) {
		
		//groupByPartition();
		//groupByPartitionset();
		groupByPartitionByMap();
		
	}

}
