package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamLimit {
	
	public static void main(String[] args) {
		
		
		List<String> listStrings=Arrays.asList("Apple","Banana","Mango","Sapoto");
		
		List<Integer> listints=Arrays.asList(1,2,3,4,5,6);
		
		
		System.out.println(listStrings.stream().limit(2).collect(Collectors.toList()));
		
		
		System.out.println(listints.stream().limit(2).collect(Collectors.toList()));
		
		System.out.println(listints.stream().limit(2).reduce(0, (a,b)->a+b));
		
		
		System.out.println(listints.stream().skip(3).collect(Collectors.toList()));
		
		
		
	}

}
