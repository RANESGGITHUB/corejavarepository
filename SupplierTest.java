package com.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.function.Supplier;

import com.repo.Person;
import com.repo.PersonRepository;

public class SupplierTest {
	
	public static void main(String[] args) {
		final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		Supplier<LocalDateTime> timeSupplier = () -> LocalDateTime.now();
        System.out.println("Current time object: " + timeSupplier.get());
        
        Supplier<Person> supplierPerson=()->PersonRepository.getPerson();
        Supplier<List<Person>> listpersonSupplier=()->PersonRepository.getListReposity();

        // Supplier to get the current time formatted as a String
        Supplier<String> formattedTimeSupplier = () -> dtf.format(LocalDateTime.now());
        System.out.println("Current time formatted: " + formattedTimeSupplier.get());
        System.out.println(supplierPerson.get());
        System.out.println(listpersonSupplier.get());
	}

}
