package mypackage;

class Test2 {
	void show()
	{
		System.out.println("parent class method called");
	}
}

class Test0 extends Test2 
{
	void show()
	{
		System.out.println("Child class method called");
		super.show();
	}
	}

class Test
{
	public static void main (String args[])
	{
	Test0 t = new Test0();
	t.show();
}
}