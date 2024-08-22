package Jpre;

import java.util.*;

public class ForEachh {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

	}

}
