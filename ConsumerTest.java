package com.test;

import java.util.List;
import java.util.function.Consumer;

import com.repo.Person;
import com.repo.PersonRepository;

public class ConsumerTest {
	
	
	
	public static void main(String[] args) {
		
		Consumer<Person> consumer1=(p)->System.out.println(p);
		Consumer<Person> consumer2=(str)->System.out.println(str.getName().toUpperCase());
		Consumer<Person> consumer3=(str)->System.out.println(str.getSalary());
		
		//consumer1.accept("ramesh");
		//consumer2.accept("ramesh");
		
		//consumer1.andThen(consumer2).accept("ragolu");
		
		Person person=PersonRepository.getPerson();
        List<Person>  list=PersonRepository.getListReposity();
		
		//consumer1.accept(person);
		//consumer2.accept(person);
		//consumer3.accept(person);
		
		//consumer1.andThen(consumer2).andThen(consumer3).accept(person);
        
        list.forEach(pp->consumer1.andThen(consumer2).accept(pp));
		
		list.forEach(p->{
			
			if(p.getSalary() > 2)
			{
				consumer1.andThen(consumer2).andThen(consumer3).accept(p);
			}
			
		});
	}

}
