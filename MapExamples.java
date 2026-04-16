package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapExamples {
	
	
	public static void main(String[] args) {
		
		Map<String, String> existingMap=new HashMap<>();
		
		existingMap.put("1", "A");
		existingMap.put("2", "J");
		existingMap.put("3", "D");
		existingMap.put("4", "C");
		
		
		 Map<String, String> copy = existingMap.entrySet()
			        .stream()
			        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		 
		// System.out.println(copy);
		 
		 Map<String, Integer> map = new HashMap<>();
		 map.put("test1", 1);
		 map.put("test2", 2);

		 Map<String, Integer> map2 = new HashMap<>();
		 map.forEach(map2::put);
		 
		 map.forEach(null);

		 System.out.println("map: " + map);
		 System.out.println("map2: " + map2);
		
	}

}
