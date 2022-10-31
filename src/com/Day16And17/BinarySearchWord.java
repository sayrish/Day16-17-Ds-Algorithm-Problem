package com.Day16And17;

import java.util.Arrays;

public class BinarySearchWord {
	public static void main(String[] args) {
		//sorting words in string type of array
		String[] words = {"Kapil", "Sager", "Sachin", "Akash", "Mohit", "Ankit", "Khushal", "Chetan"};
		
		//sorting the array
		Arrays.sort(words);
		
		//printing using inbuilt toString in String class
		System.out.println(Arrays.toString(words));
		System.out.println("Enter a Word to serarch: ");
		
	}

}
