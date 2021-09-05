import ArithemeticOperation.*;

import java.util.*;
import java.io.*;
public class ArithemeticOperationMain
{
    public static void main(String[] args)
    {
      int ch;

        Addition a = new Addition();
          Substraction s = new Substraction();
            Multiplication m = new Multiplication();
              Division d = new Division();
          do
          {
            
            System.out.println("1.Addition ");
         System.out.println("2.Substraction ");
          System.out.println("3.Multiplication");
         System.out.println("4.Division");
	System.out.println("5.Exit");

System.out.println("Enter your choice");
          Scanner sc = new Scanner(System.in);
	ch=sc.nextInt();

          switch(ch)
          {
            case 1:
                   a.calculate();
                   break;
                   case 2:
                          s.calculate();
                          break;



                          case 3:
                                 m.calculate();
                                 break;
                                 case 4:
                                        d.calculate();
                                        break;
				case 5:
                                        System.out.pritln("Exit");
                                        break;
                                        default: System.out.println("WRONG CHOICE");
          }}
          while(ch!=5);


    }
}
