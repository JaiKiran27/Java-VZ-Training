package Jpre;

import java.util.*;

public class MultiTable {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a num up to which the multiTable: ");
		int num = scanner.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print("MultiTable of " + i + ":");
			for (int j = 1; j <= 10; j++) {
				System.out.print(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
		scanner.close();
	}

}
