package mypackage;


class Methodoverloading2{

	void shape(int i)
	{
		System.out.println("Triangle:"+i);
	}
	void shape(float j)
	{
		System.out.println("Rectangle:"+j);
	}
	void shape(long k)
	{
		System.out.println("Square:"+k);
	}
}

class Methodoverloading
{
	public static void main(String[] args)
	{
		Methodoverloading2 m =new Methodoverloading2();
		m.shape(0);
		m.shape(1.3f);
		m.shape(21);
 	}
}
