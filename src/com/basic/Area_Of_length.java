package com.basic;

import java.util.Scanner;

public class Area_Of_length {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the length of the rectangle: ");
		double length = scanner.nextDouble();

		System.out.print("Enter the width of the rectangle: ");
		double width = scanner.nextDouble();

		System.out.println("The area of the rectangle is: " + length * width);
		scanner.close();
	}

}
