package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import com.repo.PersonRepository;

public class ParallewhentoNotUse {
	
	
	public static int sequnetilaStrream(List<Integer> list)
	{
		long startTime=System.currentTimeMillis();
		
		int total=list.stream().reduce(0, (a,b)->a+b);
		
		long end=System.currentTimeMillis();
		
		System.out.println("sequnetilaStrream diff " + (end-startTime));
		return total;
	}
	public static int ParalleStrream(List<Integer> list)
	{
		long startTime=System.currentTimeMillis();
		
		int total=list.stream().parallel().reduce(0, (a,b)->a+b);
		
		long end=System.currentTimeMillis();
		
		
		System.out.println("ParalleStrream diff " + (end-startTime));
		return total;
	}
	
	
	public static void main(String[] args) {
		
		List<Integer> input=Arrays.asList(1,2,3,4,5,6,7);
		
		//sequnetilaStrream(input);
		//ParalleStrream(input);
		
		Calculate cal=new Calculate();
		
		IntStream.rangeClosed(1, 500).sequential().forEach(cal::calculate);
		
		System.out.println("sequential Total time " + cal.getTotal());
		
       IntStream.rangeClosed(1, 500).parallel().forEach(cal::calculate);
		
		System.out.println("parallel Total time " + cal.getTotal());
		
	}

}
