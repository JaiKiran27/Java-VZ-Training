package mypackage;
//multiple inheritance using interface
interface I1
{
	void show();
}
class I2 implements I1
{
	public void show()
	{
		System.out.println("show method called")
	}
}
public class Interfaces {

	public static void main(String[] args) {
		{
			I2 I= new I2();
			I.show();
		}

	}

}
