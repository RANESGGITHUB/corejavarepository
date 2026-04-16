package com.test;

import java.util.function.Consumer;

public class LocalVariableinjava8 {
	
	
	static int k=10;
	
	
	public static void main(String[] args) {
		
		int i=10;
		Consumer<Integer> consumerIntejer=(j->{
			
			//i++;
			k++;
			System.out.println(k);
			System.out.println(i+j);
		});
		consumerIntejer.accept(10);
	}

}
