package com.problems;

public class PrinterErrors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
	}

	public static String printerError(String s) {
		int count = 0;
		char[] c = s.toCharArray();
		for (char ch : c) {
			if ((int)(ch) > (int)('m') && ch !=' ')
				count++;
		}
		return (String.valueOf(count) +"/"+ String.valueOf(s.length()));
	}

}
