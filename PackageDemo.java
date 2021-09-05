import Graphics.*;
import java.util.*;
import java.io.*;
public class PackageDemo
{
    public static void main(String[] args)
    {
      int ch;

        Rectangle r = new Rectangle();
          Circle c = new Circle();
          Square s=new Square();
              Triangle t=new Triangle();
          do
          {
           
            System.out.println("1. Area of Rectangle ");
         System.out.println("2. Area of Square ");
          System.out.println("3.Area of Circle");
         System.out.println("4.Area of Triangle");
	System.out.println("5.Exit");
          Scanner sc = new Scanner(System.in);
	 System.out.println("Enter your choice");
	ch=sc.nextInt();

          switch(ch)
          {
            case 1:
                   r.area();
                   break;
                   case 2:
                          s.area();
                          break;



                          case 3:
                                 c.area();
                                 break;
                                 case 4:
                                        t.area();
                                        break;
				case 5:
				 
					System.out.println("Exit");
					 break;

                                        default: System.out.println("WRONG CHOICE");
                                        
          }}
          while(ch!=5);


    }
}
