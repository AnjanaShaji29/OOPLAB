package Graphics;
import java.util.*;
import java.io.*;

public class Circle 
{

  double r;

 public void area()
 {
     Scanner sc = new Scanner(System.in);

   System.out.println ("Enter the radius of circle");
    r = sc.nextDouble();


   double a=3.14*r*r;
   System.out.println ("Area of Circle = "+a);
 }


}
