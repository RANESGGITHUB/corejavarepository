package com.test;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UninaryBinaryTest {
	
	
public static void main(String[] args) {
	
	UnaryOperator<Integer> square = x -> x * x;
	
	Function<Integer, Integer> integerFunction=(x->x*x);

    System.out.println("The square of 5 is: " + square.apply(5)); // Output: The square of 5 is: 25
    System.out.println("The square of 5 is: " + integerFunction.apply(5));

    // An example using the identity() method, which returns the input as is
    UnaryOperator<Integer> identityOp = UnaryOperator.identity();
    System.out.println("Identity function output: " + identityOp.apply(100));
}



}
