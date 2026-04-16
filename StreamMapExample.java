package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.repo.Person;
import com.repo.PersonRepository;

public class StreamMapExample {

	public static Set<String> getSet(List<Person> personList) {
		return personList.stream().map(Person::getName).collect(Collectors.toSet());

	}

	public static List<String> getList(List<Person> personList) {
		return personList.stream().map(Person::getName).collect(Collectors.toList());

	}

	public static void main(String[] args) {

		List<String> listStrings = Arrays.asList("ramesh", "devi", "navyasri", "Sushank");

		// listStrings.stream().map(String::length).collect(Collectors.toList()).forEach(value->System.out.println(value));

		List<String> listnames1 = PersonRepository.getListReposity().stream().map(Person::getName)
				.map(String::toUpperCase).collect(Collectors.toList());

		List<String> listnames2 = PersonRepository.getListReposity().stream().map(Person::getHobbies)
				.flatMap(List::stream).map(String::toUpperCase).collect(Collectors.toList());

		// System.out.println(listnames1);
		// System.out.println(listnames2);

		System.out.println(StreamMapExample.getList(PersonRepository.getListReposity()));
		System.out.println(StreamMapExample.getSet(PersonRepository.getListReposity()));

	}

}
