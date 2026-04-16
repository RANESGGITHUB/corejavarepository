package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.repo.Person;
import com.repo.PersonRepository;

public class FlatMapExample {

	public static List<String> hobbies(List<Person> list) {
		return list.stream().map(Person::getHobbies).flatMap(List::stream).toList();

	}
	
	public static List<String> distintHobbies(List<Person> list)
	{
		return list.stream().map(Person::getHobbies).flatMap(List::stream).sorted()
				.
				distinct().toList();
		
	}
	
	public static long countofHobbies(List<Person> list)
	{
		return list.stream().map(Person::getHobbies).flatMap(List::stream).distinct().count();
	}

	public static void main(String[] args) {

		List<Integer> listone = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> listtwo = Arrays.asList(6, 7, 8, 9);

		List<List<Integer>> beforeFlatmap = Arrays.asList(listone, listtwo);

		System.out.println(beforeFlatmap);

		// after streams

		List<Integer> afterflatemap = beforeFlatmap.stream().flatMap(list -> list.stream())
				.collect(Collectors.toList());

		//System.out.println(afterflatemap);

		System.out.println("reopostry hobbiles " + hobbies(PersonRepository.getListReposity()));
		
		System.out.println("Distinct hobbies " + distintHobbies(PersonRepository.getListReposity()));
		
		System.out.println("Distinct count of hobbies " + countofHobbies(PersonRepository.getListReposity()));

	}

}
