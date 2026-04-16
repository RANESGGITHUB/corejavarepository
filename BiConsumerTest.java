package com.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import com.repo.Person;
import com.repo.PersonRepository;

public class BiConsumerTest {
	
	public static void main(String[] args) {
		
		 Map<String, Integer> map = new HashMap<>();
	        map.put("Apple", 1);
	        map.put("Banana", 2);
	        map.put("Orange", 3);

	        // Using a lambda expression as a BiConsumer
	        map.forEach((key, value) -> System.out.println(key + " -> " + value));

	        // Alternative using method reference with a custom method
	       // BiConsumer<String, Integer> printEntry = (key, value) -> 
	           // System.out.println("Item: " + key + ", Quantity: " + value);
	        //map.forEach(printEntry);
	        
	        BiConsumer<String, Integer> biconsumer=(a,b)->
	        {
	            System.out.println(a +" "+ b);
	        };
	        
	        BiConsumer<String, List<String>> biconsumer2=(names,hobbies)->
	        {
	            System.out.println(names +"" + hobbies);
	        };
	        
	        List<Person> list=PersonRepository.getListReposity();
	        
	        Person person=PersonRepository.getPerson();
	        
	        //biconsumer.accept(person.getName(), person.getPid());
	        
	        //biconsumer2.accept(person.getName(), person.getHobbies());
	        
	        list.forEach(p->{
	        	biconsumer2.accept(p.getName(), p.getHobbies());
	        });
	        
	        list.forEach(p->{
	        	biconsumer2.accept(p.getName(),p.getHobbies());
	        });
	}

}
