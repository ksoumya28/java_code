package com.java.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice3 {

	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
		question6();
		question7();
		question8();
		question9();
		question10();

	}

	private static void question10() {
		//Calculate the product of all numbers in a list using Streams.
		List<Integer> list1= Arrays.asList(10,12,15,17,20,5,10,12,12);

		list1.stream().map(n->n*n).collect(Collectors.toList()).forEach(System.out::println);
		
	}

	private static void question9() {
		// Find the most frequent number in a list of integers.

		List<Integer> list1 = Arrays.asList(10, 12, 15, 17, 20, 5, 10, 12, 12);

		System.out.println(
				"Reapitied--" + list1.stream().collect(Collectors.groupingBy(Integer::valueOf, Collectors.counting()))
						.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).get().getKey());

	}

	private static void question8() {
		// Find all pairs of integers from two lists whose sum is divisible by a given
		// number.
		int number = 5;
		List<Integer> list1 = Arrays.asList(10, 12, 15, 17, 20, 5);
		List<Integer> list2 = Arrays.asList(25, 30, 45, 60, 1, 11, 12);

		List<Integer> concatedList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());

		concatedList.stream().filter(n -> n % 5 == 0).collect(Collectors.toList()).forEach(System.out::println);

	}

	private static void question7() {

		// Create a list of unique characters from a list of strings.

		List<String> stringList = Arrays.asList("Apple", "Banana", "Pineapple");
		List<Character> charList2 = stringList.stream().flatMapToInt(String::chars).mapToObj(c -> (char) c)
				.collect(Collectors.toList());

		Map<Character, Long> map = charList2.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		// System.out.println(map);

		map.entrySet().stream().filter(n -> n.getValue() < 2).map(n -> n.getKey()).forEach(System.out::println);

	}

	private static void question6() {
		// Remove all null elements from a list using Streams.
		List<Integer> intList = Arrays.asList(1, 2, null, 3, null);
		intList.stream().filter(n -> n != null).collect(Collectors.toList()).forEach(System.out::println);

	}

	private static void question5() {
		// Find the longest string in a list of strings.

		List<String> stringList = Arrays.asList("Apple", "Banana", "Pineapple");
		System.out.println(stringList.stream().max((w1, w2) -> Integer.compare(w1.length(), w2.length())).get());
	}

	private static void question4() {

		// Create a frequency map that counts how many times each word appears in a list
		// of strings.
		List<String> stringList = Arrays.asList("Apple", "Banana", "Apple", "Pineapple", "Pear", "Pineapple");

		stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().forEach(System.out::println);
		;

	}

	private static void question3() {

		// Fibonnacci series
		int n = 20;
		Stream.iterate(new int[] { 0, 1 }, fib -> new int[] { fib[1], fib[0] + fib[1] }).limit(20).map(fib -> fib[0])
				.collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void question2() {
		// Partition a list of numbers into even and odd numbers using Streams.
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(nums.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0)));

	}

	private static void question1() {

		// Convert a list of integers to their square values and collect them into a new
		// list.
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		nums.stream().map(n -> n * n).collect(Collectors.toList()).forEach(System.out::println);

	}

}
