package com.basic;

import java.util.Scanner;

public class RectangleAreaCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of the rectangle: ");
		double length = scanner.nextDouble();
		System.out.print("Enter the width of the rectangle: ");
		double width = scanner.nextDouble();
		scanner.close();
		double area = length * width;
		System.out.println("The area of the rectangle with length " + length + " and width " + width + " is: " + area);
	}
}
