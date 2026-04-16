package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import javax.annotation.processing.SupportedSourceVersion;

import com.repo.Person;
import com.repo.PersonRepository;

public class ComputeIfAbsent {

	static Map<String, List<String>> countrySityMap = new HashMap<>();
	
	static Map<String, Person> presonMap=new HashMap<>();
	
	

	public static void addPersons(String keyname, Person person) {
		
		presonMap.computeIfAbsent(keyname, keyVale->person);
		
	}

	public static void addCountryAndCities(String country, String city) {
		
		
		
		countrySityMap.computeIfAbsent(country, listValue->new ArrayList<>()).add(city);
		
		
		
		/*
		 * if (countrySityMap.containsKey(country)) {
		 * countrySityMap.get(country).add(city); } else { countrySityMap.put(country,
		 * new ArrayList<>(List.of(city))); }
		 */
	}

	public static void main(String[] args) {
		
		addPersons("ramesh1", PersonRepository.getPerson());
		addPersons("ramesh2", PersonRepository.getPerson());
		addPersons("ramesh3", PersonRepository.getPerson());
		addPersons("ramesh4", PersonRepository.getPerson());
		
		System.out.println("Default " +countrySityMap.getOrDefault("India", null));
		
		//System.out.println(presonMap);
		
		addCountryAndCities("India","Delhi");
		addCountryAndCities("Bangladesh","Dakha");
		addCountryAndCities("Nepla","Katmadu");
		addCountryAndCities("Sot","Delhi");
		addCountryAndCities("India","Hyderabd");
		
		//System.out.println(countrySityMap);

		HashMap<String, Integer> hm = new HashMap<>();

		// Adding initial values to the map
		hm.put("A", 1);
		hm.put("B", 2);

		Integer i = hm.computeIfAbsent("C", key -> key.length());

		Integer j = hm.computeIfAbsent("C", key -> key.length());

		// System.out.println("i value " + i);

		// System.out.println("Initial Map: " + hm);

		Map<String, Person> mapPerson = new HashMap<>();
		mapPerson.put("1", PersonRepository.getPerson());

		

		//mapPerson.computeIfAbsent("2", Person -> PersonRepository.getPerson());

		// System.out.println(mapPerson);

	}

}
