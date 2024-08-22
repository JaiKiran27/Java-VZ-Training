package Jpre;

import java.util.*;
import java.io.*;

public class Clock {

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Hours,mins and Sec: ");
		int h = s.nextInt();

		int m = s.nextInt();
		int sec = s.nextInt();
		System.out.println("Clock");
		System.out.println("=====");

		for (h = h; h < 24; h++) {
			for (m = m; m < 60; m++) {
				for (sec = sec; sec < 60; sec++) {
					System.out.println(h + ":" + m + ":" + sec + "\r");
					Thread.sleep(1000);
				}
				sec = 0;
			}
			m = 0;
		}
		h = 0;
	}
}
