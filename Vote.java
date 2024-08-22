package Jpre;

import java.util.*;

public class Vote {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your age: ");
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("You are Eligible to Vote!");
		} else {
			System.out.println("You are not Eligible to Vote!");
		}
		scanner.close();

	}

}
