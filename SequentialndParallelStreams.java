package com.test;

import java.util.List;

import com.repo.Person;
import com.repo.PersonRepository;

public class SequentialndParallelStreams {
	
	
	public static void executeWithSequntialStreams()
	{
		long time=System.currentTimeMillis();
				
		System.out.println(PersonRepository.getListReposity().stream().sequential().map(Person::getHobbies).flatMap(List::stream).toList());
		long end=System.currentTimeMillis();
		
		long diff=end-time;
		
		System.out.println("executeWithSequntialStreams  diff " + diff);
	}
	public static void executeWithParallelStreams()
	{
		long time=System.currentTimeMillis();
		System.out.println(PersonRepository.getListReposity().stream().parallel()
				.map(Person::getHobbies).flatMap(List::stream).toList());
		long end=System.currentTimeMillis();
		long diff=end-time;
		
		System.out.println("executeWithParallelStreams  diff " + diff);
	}
	
	public static void main(String[] args) {
		executeWithSequntialStreams();
		executeWithParallelStreams();
		
	}

}
