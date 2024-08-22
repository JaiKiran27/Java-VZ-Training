package mypackage;
import java.util.*;
import java.io.*;

class Exd 
{
	public static void main (String args[]) throws Exception
	{
		try 
		{
			FileReader fr=new FileReader("table.txt");
		}	
		catch(IOException ie)
		
			{
				System.out.println("IOException");
			}
				catch (Exception e)
				{
					System.out.println("Parent Exception");
				}

}
}
