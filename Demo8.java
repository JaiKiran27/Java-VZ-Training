package mypackage;

//mul inheritance using interface
interface I1
{
	int id=55;
}
interface I2
{
	int id=57;
}
class Demo8 implements I1,I2 {

	public static void main(String[] args) {
		System.out.println("values of id="+I1.id);

	}

}
