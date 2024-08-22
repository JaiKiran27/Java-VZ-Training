package Jpre;

import java.util.*;

public class Demo365 {

	public static void main(String[] args) throws Exception {
		int a[] = { 44, 21, 34, 43, 33 };

		System.out.println("Accepted Array!");
		for (int i : a) {
			System.out.println(i);
		}
		Arrays.sort(a);
		System.out.println("Sorted Array!");
		for (int i : a) {
			System.out.println(i);
		}

	}

}
