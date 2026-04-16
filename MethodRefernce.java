package com.test;

import java.util.Arrays;
import java.util.List;

public class MethodRefernce {
	
	
	public static void greet(String wish)
	{
		System.out.println("Hi good morning " + wish);
	}
	
	
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("ramesh","satish","bhaskaro","ramaro");
		
		//System.out.println(greet(names));
		
		//names.forEach(name->greet(name));
		
		names.forEach(MethodRefernce::greet);
	}

}
