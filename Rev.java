package Jpre;

import java.util.Scanner;

public class Rev {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Num: ");
		int num = scanner.nextInt();

		int reversedNum = 0;

		while (num != 0) {
			int digit = num % 10;
			reversedNum = reversedNum * 10 + digit;
			num /= 10;
		}

		System.out.print("RevNum :" + reversedNum);
		scanner.close();

	}

}
