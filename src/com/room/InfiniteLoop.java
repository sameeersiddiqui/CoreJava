package com.room;

public class InfiniteLoop {
	public static void main(String[] args) {
		int num= 2 ;
		for(;;) {
			if (num == 2) {
				System.out.println("Ohoo!");
				break;
				
			}
			System.out.println("Ahaa!");
		}
	}

}
