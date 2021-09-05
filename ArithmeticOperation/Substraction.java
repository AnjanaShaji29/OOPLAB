package ArithmeticOperation;
import java.util.*;
import java.io.*;


public class Substraction implements TestInterface
{
 float l,b;
public  void calculate()
  {
  Scanner sc = new Scanner(System.in);

    System.out.println ("Enter the 1st num:");
    l = sc.nextFloat();
    System.out.println ("Enter the 2nd num:");
    b = sc.nextFloat();
    float d=l-b;
    System.out.println ("difference is "+d);
  }


}
