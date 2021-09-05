package Graphics;
import java.util.*;
import java.io.*;


public class Triangle
{	
public	void area()
	{
		float b,h;
		Scanner sc = new Scanner(System.in);

		System.out.println ("Enter the breadth of triangle:");
		  b = sc.nextFloat();

      System.out.println ("Enter the height of triangle:");
        h = sc.nextFloat();
		  System.out.println("Area of  triangle = "+(b+h)/2);
	}
}
