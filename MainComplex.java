import java.util.Scanner;
class Complex
{
	double real;
	double imag;
}
Complex()
{
	real=0.0;
	imag=0.0;
}
Complex(double rp)
{
	real=rp;
	img=0.0;
}
Complex(double rp,double ip)
{
	real=rp;
	img=ip;
}
complex plus(complex c)
{
	Complex sum=new sum(real+c.real,img+c.img);
	return sum;
}
void getcomplex()
{
	System.out.println(("+real+"+"+img+"i));
}


class MainComplex
{
	public static void main(String args[])
{
	double rp,ip;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the 1st complex number(real,img):");
	rp=s.nextDouble();
	ip=s.nextDouble();
	Complex c1=new Complex(rp,ip);
	System.out.println("Enter the 2nd complex number(real,img):");
	rp=s.nextDouble();
	ip=s.nextDouble();
	Complex c2=new Complex(rp,ip);
	Complex sum=new Complex();
	sum=c1plus(c2);
	System.out.println("Sum of complex number is:");
	c1=getcomplex();
	System.out.print("+");
	c2=getcomplex();
	System.out.print("=");
	sum.getcomplex();
	
}
}












public static void main(String args[])
{
System.out.println("Welcome to Java Programming");
}
}