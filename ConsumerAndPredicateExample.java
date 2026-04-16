package com.test;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.repo.Person;
import com.repo.PersonRepository;

public class ConsumerAndPredicateExample {
	
	static Predicate<Person> predicteGender=(person)->person.getName().equals("ramesh1");
	static Predicate<Person> predicteId=(person)->person.getPid()==1;
	
	static BiPredicate<Integer, String> bipredicate=(id,name)->id==2 && name.equals("ramesh2");
	
	
	static BiConsumer<String, List<String>> biconsumer2=(names,hobbies)->
    {
        System.out.println(names +"" + hobbies);
    };
    
    static Consumer<Person> consumerPerson=(person)->
    {
    	if(bipredicate.test(person.getPid(), person.getName()))
    	//if(predicteGender.and(predicteId).test(person))
    	{
    		biconsumer2.accept(person.getName(), person.getHobbies());
    	}
    	else
    	{
    		System.out.println("No data found");
    	}
    };
	
	public static void main(String[] args) {
		
		Person person=PersonRepository.getPerson();
		
		consumerPerson.accept(person);
	}

}
