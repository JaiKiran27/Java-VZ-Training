package Jpre;

public class Demo {

	public static void main(String[] args) {
		String exampleString = "Hello, World!";

		int length = exampleString.length();
		System.out.println("length of the string: " + length);

		char charAtIndex = exampleString.charAt(7);
		System.out.println("character at index 7: " + charAtIndex);

		String substring = exampleString.substring(7, 12);
		System.out.println("Substring from index 7 to 12: " + substring);

	}

}
