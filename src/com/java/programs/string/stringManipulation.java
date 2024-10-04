package com.java.programs.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class stringManipulation {
	
	public static void main (String[] args)
	{
		stringReverse();
		checkPallindrome();
		firstNonRepeatingChar();
		countTheOccurenceofSubstring();
		longestUniqueSubstring();
		stringCompression();
		stringRotationIstrue();
		removeDuplicatesFromAString();
		stringPermutations();
	}

	private static void stringPermutations() {
		
		String str = "abc";
		String s = "";
		List<String> strList = new ArrayList<String>();
		
	}

	private static void removeDuplicatesFromAString() {
		//Write a function to remove all duplicate characters from a string while maintaining the order of characters.
		//Example: Input: "programming" → Output: "progamin"
		
		 String str = "programming";
	     LinkedHashSet<Character> set = new LinkedHashSet<>();
	     StringBuilder strBuilder = new StringBuilder();
	     for(char ch:str.toCharArray())
	     {
	    	 set.add(ch);
	     }
	     System.out.println(set);

	     for(char ch:set)
	     {
	    	 strBuilder.append(ch);
	     }
	     
	     System.out.println(strBuilder);
	     

		
	}

	private static void stringRotationIstrue() {
		//Question: Given two strings, check if one is a rotation of the other using only one call to a substring checking function.
		//Example: Input: "waterbottle", "erbottlewat" → Output: 

		 String str="waterbottle";
		 String str2="erbottlewat";
		 
		 str= str.concat(str);
		 System.out.println(str);
		 
		 if(str.contains(str2))
		 {
			 System.out.println(true);
		 }
		 else
		 {
			 System.out.println(false);
		 }
	}

	private static void stringCompression() {
		
		//Given a string, find the length of the longest substring without repeating characters.
		//"aabcccccaaa" → Output: "a2b1c5a3"
		
		String str = "aabcccccaaa";
		StringBuilder compressedStr =new StringBuilder();
		int count=1;
		
		for(int i=1;i<str.length();i++)
		{
			if(str.charAt(i)==str.charAt(i-1))
			{
				count++;
				
			}
			else
			{
				compressedStr.append(str.charAt(i-1));
				compressedStr.append(count);
				count=1;
			}
		}
		
		compressedStr.append(str.charAt(str.length() - 1));
        compressedStr.append(count);
        
		System.out.println(compressedStr.toString());
	}

	private static void longestUniqueSubstring() {
		//Given a string, find the length of the longest substring without repeating characters.
		String s ="Java";
		int count =0;
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char [] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			char ch = arr[i];
			if(!map.containsKey(ch))
			{
				map.put(ch, i);
			}
			else
			{
				i=map.get(ch);
				map.remove(ch);
			}
			
			if(map.size()>count)
			{
				count=map.size();
			}
		}
		
		
		System.out.println("Length of longest uniques substring: "+count);
	}

	private static void countTheOccurenceofSubstring() {
		
		String str = "abababababab";
		String subStr = "ab";
		
		int lastIndex=0;
		int count=0;
		while(lastIndex!=-1)
		{
			lastIndex = str.indexOf(subStr,lastIndex);
			
			if(lastIndex!=-1)
			{
				count++;
				lastIndex = lastIndex+subStr.length();
			}
			
		}
		
		System.out.println("Count: "+count);
	}

	private static void firstNonRepeatingChar() {
		
		
		String str ="swiss";
		List<Character> charList = str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		
							charList.stream()
								.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
								.entrySet()
								.stream().filter(e->e.getValue()==1).forEach(System.out::println);
	}

	private static void checkPallindrome() {
		
		String pallindrome="abba";
		StringBuilder strBulBuilder = new StringBuilder(pallindrome);
		
		if(strBulBuilder.reverse().equals(strBulBuilder))
		{
			System.out.println(true);
		}
		
		List<String> strList = Arrays.asList(pallindrome);
		boolean isPallindromes = strList.stream().anyMatch(s->s.equals(strBulBuilder.reverse().toString()));
		
		System.out.println(isPallindromes);
		//pallindromes.stream().forEach(System.out::println);
	}
	
	private static void stringReverse() {
		
		String str = "Beautiful";
		StringBuilder strBuilder = new StringBuilder(str);
		System.out.println("Reversed using string builder--"+strBuilder.reverse());
		
		//List<Character> charList = str.chars().mapToObj(e->(char)e).collect(Collectors.toList());
		
		List<String> arr = Arrays.asList(str);
		System.out.println("Reversed String using streams: "+ arr.stream().map(x->new StringBuilder(x).reverse()).collect(Collectors.joining("")));

	}


}
