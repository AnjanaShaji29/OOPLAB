package Graphics;
import java.util.*;
import java.io.*;

public class Square 
{
	float x;

	public void area()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println ("Enter the side of Square");
		  x = sc.nextFloat();

		  System.out.println("the area of the square is "+(x*x)+" sq units");
	}
}
