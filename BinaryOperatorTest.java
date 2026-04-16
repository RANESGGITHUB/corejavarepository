package com.test;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
	
	static BiFunction<Integer, Integer, String> bifunction=(i,j)->{
		
		String result=i+" java "+j+" version ";
		return result;
		
	};
	
	static BinaryOperator<String> binaryString=(i,j)->{
		
		String result=i+" java "+j+" version ";
		return result;
		
	};
	
	static Comparator<Integer> comparator=(i,j)->i.compareTo(j);
	
	static BinaryOperator<Integer> binaryCompariorMax=BinaryOperator.maxBy(( a, b)->(a > b) ? 1 :( a < b) ? -1 : 0);
	static BinaryOperator<Integer> binaryCompariorMin=BinaryOperator.minBy(( a, b)->(a > b) ? 1 :( a < b) ? -1 : 0);
	
	public static void main(String[] args) {
		
		
		//System.out.println(bifunction.apply(10, 20));
		//System.out.println(binaryString.apply("10", "20"));
		//System.out.println(binaryCompariorMax.apply(100, 10));
		System.out.println(binaryCompariorMin.apply(10,30));
		BinaryOperator<Integer> test=BinaryOperator.maxBy(comparator);
		//System.out.println(test.apply(10,20));
		
	}

}
