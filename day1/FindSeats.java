package day1;

import java.util.Scanner;

public class FindSeats {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		int seat = scanner.nextInt();
		seat %= 6;
		if(seat == 1 || seat == 0)
			System.out.println("window seat");
		if(seat == 5 || seat == 2)
			System.out.println("middle seat");
		else
			System.out.println("aisle seat");
	}
}
