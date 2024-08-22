package mypackage;

class Demo21 
{
	public static void main(String args[]) {
		String s1="Hydra";
		String s2="bad";
		String s3=s1.concat(s2);
		System.out.println(s3);
		String s4=s3.toUpperCase();
		System.out.println(s4);
		String s5=s4.replace('A','Z');
		System.out.println(s5);
	}

}
