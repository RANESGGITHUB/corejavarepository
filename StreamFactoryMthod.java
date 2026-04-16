package com.test;

import java.util.List;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.function.IntToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamFactoryMthod {
	
	static BinaryOperator<Integer> bi=(a,b)->a+b;
	
	
	public static int  calculateSum(List<Integer> list)
	{
		return list.stream().reduce(0, bi);
	}
	
	public static int  calculateSumIntStream(IntStream intStream)
	{
		return intStream.sum();
	}
	
	
	public static List<Integer> boxedMethod()
	{
		
		return IntStream.rangeClosed(1, 50).boxed().collect(Collectors.toList());
	}
	
	public static int withoutboxedMethod(List<Integer> list)
	{
		
		return list.stream().mapToInt(Integer::intValue).sum();
	}
	
	static IntToDoubleFunction intValue=(intgetvalue)->intgetvalue;
	
	public static double mapToDouble()
	{
		return IntStream.range(0, 50).mapToDouble((intgetvalue)->intgetvalue).sum();
		
	}
	
	public static List<Integer> convetInputStreeamToListOfIntegers()
	{
        return IntStream.range(1, 10).mapToObj(intValueInteger->intValueInteger).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
		IntStream stream1=IntStream.rangeClosed(1, 7);
		IntStream stream2=IntStream.range(1, 7);
		
		
//stream1.forEach(System.out::println);

//System.out.println("++++++++++++++++");
		
//stream2.forEach(System.out::println);


//LongStream.rangeClosed(1, 50).forEach(System.out::println);

//System.out.println("+++++++++++++++++++");

//LongStream.range(1, 50).forEach(System.out::println);
		
		
		int sum=IntStream.rangeClosed(1, 7).sum();
		
		OptionalInt opint=IntStream.rangeClosed(1, 7).max();
		
		if(opint.isPresent())
			System.out.println(opint.getAsInt());
		
		//System.out.println(sum);
		
		//System.out.println("mapToDouble() " + mapToDouble());
		
		System.out.println("int to integers" + convetInputStreeamToListOfIntegers());
	}

}
