package Jpre;

class Animal {

	public void eat() {
		System.out.println("Animal is Eating Food!");
	}
}

class dog extends Animal {
	public void roar() {
		System.out.println("Dog is Roaring!");
	}

	public void sleep() {
		System.out.println("Dog is Sleeping!");
	}

	public void run() {
		System.out.println("Dog is Running!");
	}

	public void eat(int i) {
		System.out.println("Dog is Eating!");

	}
}

public class SingleInheritDemo {
	public static void main(String[] args) {
		dog mydog = new dog();

		mydog.eat();
		mydog.sleep();
		mydog.roar();
		mydog.eat(3);
	}
}
