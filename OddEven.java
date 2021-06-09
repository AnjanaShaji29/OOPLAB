import java.util.Scanner;
class OddEven
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=s.nextInt();
	if(n%2==0)
	System.out.println(+n+"is an Even number");
	else
	System.out.println(+n+"is an Odd number");
}
}