package com.problems;

import java.util.ArrayList;

public class CreatePhoneNumber {

	public static void main(String[] args) {

//		Write a function that accepts an array of 10 integers (between 0 and 9), that returns 
//		a string of those numbers in the form of a phone number.

		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i = 1; i < 11; i++) {
			ar.add(i);
		}
		ar.remove(5);
		// ar.re
		System.out.println(ar.toString());

	}
}
