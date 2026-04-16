package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import com.repo.Person;
import com.repo.PersonRepository;

public class MethodRefernces {

	Function<String, String> functionString = String::toUpperCase;

	public static void printMmehtod(String str) {
		System.out.println(str);

	}

	static Predicate<Person> personPerdicate = MethodRefernces::checkHight;

	public static boolean checkHight(Person person) {
		if (person.getGender().equalsIgnoreCase("M")) {
			return true;
		}
		return false;
	}

	static void square(int n) {
		System.out.println(n * n);
	}

	public static void main(String[] args) {

		String[] names = { "Geek1", "Geek2", "Geek3" };
		List<Integer> list = Arrays.asList(2, 3, 4);
		// Arrays.stream(names).forEach(MethodRefernces::printMmehtod);

		// list.stream().forEach(MethodRefernces::square);
		// list.forEach(null);

		Person peson = PersonRepository.getPerson();
		System.out.println(personPerdicate.test(peson));
	}

}
