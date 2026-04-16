package com.test;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.repo.Person;
import com.repo.PersonRepository;

public class CharArrayToString {
	
	
	public static String getappPersonNames()
	{
		return PersonRepository.getListReposity().stream().map(Person::getName).collect(Collectors.joining("-","[","]"));
	}
	
	public static void main(String[] args) {
		
		
		char[] ch= {'D','E','V','I','R'};
		
		
		String join=Stream.of(ch).map(arr->new String(arr)).collect(Collectors.joining());
		String join1=Stream.of(ch).map(arr->new String(arr)).collect(Collectors.joining("_"));
		String join2=Stream.of(ch).map(arr->new String(arr)).collect(Collectors.joining("_", "[", "]"));
		
		//System.out.println(join.toString());
		//System.out.println(join1.toString());
		//System.out.println(join2.toString());
		
		System.out.println(getappPersonNames());
	}

}
