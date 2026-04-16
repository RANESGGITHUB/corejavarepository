package com.test;

import java.util.List;
import java.util.function.Predicate;

import com.repo.Person;
import com.repo.PersonRepository;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		Predicate<Person> predicteGender=(person)->person.getName().equals("ramesh2");
		Predicate<Person> predicteId=(person)->person.getPid()==2;
		
		
		//System.out.println(predicateInt.test(5));
		
		List<Person> listPerson=PersonRepository.getListReposity();
		Person person=PersonRepository.getPerson();
		
		//System.out.println(predicteGender.and(predicteGender).negate().test(person));
		
		//System.out.println(listPerson.stream().filter(predicteGender).toList());
		
		listPerson.forEach(personconsumer->{
			if(predicteId.test(personconsumer))
			{
				System.out.println(personconsumer);
			}
		});
		
		
	}

}
