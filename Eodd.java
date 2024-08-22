package Jpre;

import java.util.*;

public class Eodd {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter A No: ");
		int a = s.nextInt();

		if (a % 2 == 0)
			System.out.println("This Is a Even Number");

		else {
			System.out.println("This Is a Odd Number");
		}
	}
}
