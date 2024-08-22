package mypackage;

abstract class Abs {
	abstract void show();
	void disp() {
		System.out.println("complete method of the abstarct class");
	}
}

class Test3 extends Abs{
	void show()
	{
		System.out.println("Abstract method of the test class");
}
}
class Demo7
{
	public static void main(String args[])
	{
		Test3 t=new Test3();
		t.show();
		t.disp();
	}
}
