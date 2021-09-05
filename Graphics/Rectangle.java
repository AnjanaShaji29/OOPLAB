package Graphics;
import java.util.*;
import java.io.*;

public class Rectangle 
{
  float l,b;
public  void area()
  {
  Scanner sc = new Scanner(System.in);

    System.out.println ("Enter the length of Rectangle:");
    l = sc.nextFloat();
    System.out.println ("Enter the breadth of Rectangle:");
    b = sc.nextFloat();
   float a=l*b;
    System.out.println ("Area of Rectangle is "+a);
  }


}
