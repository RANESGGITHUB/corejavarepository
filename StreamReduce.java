package com.test;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.stream.Stream;

import com.repo.Person;
import com.repo.PersonRepository;

public class StreamReduce {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

		Stream<String> streamstr = Stream.of("A", "B", "C", "D", "E");

		// Use reduce() to compute the sum of the elements
		// Optional<Integer> sum = stream.reduce(Integer::sum);

		// Print the sum if present
		// sum.ifPresent(System.out::println);

		// Consumer<Integer> consumer=(intValue)->System.out.println(intValue);
		// sum.ifPresent(consumer);
		/// BinaryOperator<Integer> binaryInt=(a,b)->a*b;

		// int product=stream.reduce(1, binaryInt);

		// System.out.println(product);

		String result = streamstr.parallel().reduce("", // Identity
				(s1, s2) -> s1 + s2, // Accumulator
				(s1, s2) -> s1 + s2 // Combiner
		);

		// System.out.println(result);

		String namesConcate = PersonRepository.getListReposity().stream().map(Person::getName).reduce("",
				(a, b) -> a.concat(b));

		//int totalcount = PersonRepository.getListReposity().stream().map(Person::getPid).reduce(0, (a, b) -> a + b);
		int totalcount = PersonRepository.getListReposity().stream().map(Person::getPid).reduce(0, Integer::sum);

		// System.out.println(namesConcate);

		System.out.println(totalcount);
	}

}
