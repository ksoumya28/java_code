package com.java.programs.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice2 {

	public static void main(String[] args) {
		// question1();
		// question2();
		// question3();
		question4();

	}

	private static void question4() {
		// Given a String, find the first non-repeated character in it using Stream
		// functions

		String str = "ananya";
		List<Character> charList = str.chars().mapToObj(e -> (char) e).collect(Collectors.toList());

		
		Character value = charList.stream()
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(n -> n.getValue() < 2).map(n -> n.getKey()).findFirst().get();

		System.out.println("First non repeating char: " + value);
	}

	private static void question3() {
		// Given a list of integers, find the maximum value element present in it using
		// Stream functions?

		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 25, 15);

		int max = myList.stream().max(Integer::compareTo).get();
		System.out.println(max);

	}

	private static void question2() {
		// How to find duplicate elements in a given integers list in java using Stream
		// functions
		List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 25, 15);

		myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(n -> n.getValue() > 1).map(n -> n.getKey()).forEach(System.out::println);

	}

	private static void question1() {
		// Given a list of integers, find out all the numbers starting with 1 using
		// Stream functions

		List<Integer> numbers = Arrays.asList(10, 15, 8, 11, 125, 198, 32);

		String string = numbers.stream().map(n -> String.valueOf(n)).filter(s -> s.startsWith("1"))
				.collect(Collectors.joining(","));

		System.out.println(string);
	}
}
