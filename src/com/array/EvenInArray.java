package com.array;

public class EvenInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 8 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}

		}

	}

}
