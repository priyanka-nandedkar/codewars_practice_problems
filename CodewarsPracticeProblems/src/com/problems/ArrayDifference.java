package com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDifference {

	public static void main(String[] args) {
		int[] a = { 1, 2, 2 };
		int[] b = { 1, 2 };
		System.out.println(Arrays.toString(arrayDiff(a, b)));
	}

	private static int[] arrayDiff(int[] a, int[] b) {
		if (a.length == 0 || b.length == 0)
			return a;
		
		List<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (isFoundInSecondArray(b, a[i]) == false) {
				arrayList.add(a[i]);
			}
		}
		return arrayList.stream().mapToInt(Integer::intValue).toArray();
	}

	private static boolean isFoundInSecondArray(int[] b, int num) {
		for (int i = 0; i < b.length; i++) {
			if (b[i] == num)
				return true;
		}
		return false;
	}

}
