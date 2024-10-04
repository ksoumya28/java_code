package com.java.programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Practice1 {

	public static void main(String[] args) {
		// Filtering Operations

		printEvenNumbers();
		printNamesStartingA();
		filterStringByLength();

		// transformingOperations

		convertToUpperCase();
		squareNumbers();
		extractFirstChar();

		// sorting
		sortNumbersAsc();
		sortAlphabetically();
		sortByLength();
		sortInDescendingOrder();

		// SortAndFilter
		filterOnEven();

		// TransformAndFilter

		upperCaseAndLength();

		// SortMap
		ascToMap();

		// Advanced

		// top3Longest();
		sumSquaresEvenNumber();
		findMinMaxOfWords();

	}

	private static void findMinMaxOfWords() {
		// Given a list of strings, find and print the shortest and longest words in the
		// list.

		List<String> words = Arrays.asList("cat", "hippopotamus", "dog", "whale", "giraffe", "fox");

		words.stream().min((s, s2) -> Integer.compare(s.length(), s2.length())).ifPresent(System.out::println);
		words.stream().max((s, s2) -> Integer.compare(s.length(), s2.length())).ifPresent(System.out::println);

	}

	private static void sumSquaresEvenNumber() {
		// Given a list of integers, filter out the even numbers, square them, and find
		// the sum of those squares.

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		Optional<Integer> sum = numbers.stream().filter(n -> n % 2 == 0).map(n -> n * n).reduce(Integer::sum);
		if (sum.isPresent()) {
			System.out.println(sum.get());
		}

	}

	private static void top3Longest() {

		// Given a list of strings, find the top 3 longest words by length and print
		// them.

		List<String> words = Arrays.asList("pineapple", "apple", "strawberry", "blueberry", "kiwi");

		words.stream().sorted((w1, w2) -> Integer.compare(w2.length(), w1.length())).limit(3)
				.forEach(System.out::println);
		;

	}

	private static void ascToMap() {

		// Given a list of integers, sort them in ascending order and then map each
		// number to its double.

		List<Integer> numbers = Arrays.asList(7, 2, 5, 3, 10);

		numbers.stream().sorted().map(n -> n * n).collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void upperCaseAndLength() {

		// Given a list of words, convert them to uppercase and then filter out words
		// that have more than 5 characters.

		List<String> words = Arrays.asList("apple", "banana", "cat", "dog", "elephant", "fox");

		words.stream().filter(s -> s.length() > 5).map(String::toUpperCase).forEach(System.out::println);

	}

	private static void filterOnEven() {

		// Given a list of integers, filter out even numbers and then sort the remaining
		// numbers in ascending order.

		List<Integer> numbers = Arrays.asList(12, 5, 8, 19, 21, 2, 15, 9);

		numbers.stream().filter(n -> n % 2 == 0).sorted().forEach(System.out::println);

	}

	private static void sortInDescendingOrder() {

		// Given a list of integers, sort the list in descending order.

		List<Integer> numbers = Arrays.asList(8, 3, 5, 1, 9, 2);

		numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

	}

	private static void sortByLength() {

		// Given a list of words, sort the words by their length in ascending order.

		List<String> words = Arrays.asList("apple", "fig", "banana", "kiwi", "grape");

		words.stream().sorted((word1, word2) -> Integer.compare(word1.length(), word2.length()))
				.forEach(System.out::println);
	}

	private static void sortAlphabetically() {

		// Given a list of strings, sort them alphabetically.

		List<String> names = Arrays.asList("Charlie", "Alice", "Bob", "David");

		names.stream().sorted().forEach(System.out::println);
	}

	private static void sortNumbersAsc() {

		// Given a list of integers, sort the list in ascending order.

		List<Integer> numbers = Arrays.asList(5, 3, 8, 2, 9, 1, 6);

		numbers.stream().sorted().forEach(System.out::println);

	}

	private static void extractFirstChar() {

		// Given a list of strings, transform the list to only contain the first
		// character of each word.

		List<String> words = Arrays.asList("dog", "cat", "elephant", "giraffe", "lion");

		words.stream().map(s -> s.substring(0, 1)).collect(Collectors.toList()).forEach(System.out::println);

	}

	private static void squareNumbers() {

		// Given a list of integers, map each number to its square and print the
		// resulting list.

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		numbers.stream().map(n -> n * n).collect(Collectors.toList()).forEach(System.out::println);

	}

	private static void convertToUpperCase() {
		// Given a list of lowercase words, convert each word to uppercase and print the
		// result.

		List<String> words = Arrays.asList("apple", "banana", "grape", "mango");

		words.stream().map(String::toUpperCase).collect(Collectors.toList()).forEach(System.out::println);

	}

	private static void filterStringByLength() {
		// Given a list of strings, filter and print only the strings that are longer
		// than 4 characters.

		List<String> words = Arrays.asList("apple", "bat", "cat", "elephant", "dog", "horse");

		words.stream().filter(s -> s.length() > 4).collect(Collectors.toList()).forEach(System.out::println);

	}

	private static void printNamesStartingA() {
		// Given a list of names, filter out and print only the names that start with
		// the letter 'A'.
		List<String> names = Arrays.asList("Alice", "Bob", "Andrew", "Ann", "Tom", "John");

		names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList()).forEach(System.out::println);

	}

	private static void printEvenNumbers() {

		// Given a list of strings, filter and print only the strings that are longer
		// than 4 characters.

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		nums.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

	}

}
