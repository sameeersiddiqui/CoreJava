package com.room;

public class ExceptionHandling {
	public static void main(String[] args) {
		try {

			int a = 10, b = 0, c = a / b;
			System.out.println(c);
		} catch (Exception e) {
  
			e.printStackTrace();
			System.out.println("Yasir");
		}
		
	}
}
