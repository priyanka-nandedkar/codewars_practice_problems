package com.problems;


public class KeepHydrated {

	public static void main(String[] args) {
		System.out.println(Liters(11.8));
	}

	private static int Liters(double time) {
		return ((int) (Math.floor(time) * 0.5));
	}

}
