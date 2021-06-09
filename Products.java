import java.util.Scanner;
class product{
	int pcode;
	String pname;
	float price;
	product(int pc,String pn,float pr)
{  
		pcode=pc;
		pname=pn;
		price=pr;
}
	void display()
{ 		     
	System.out.println("pcode:"+pcode);
	System.out.println("pname:"+pname);
	System.out.println("price:"+price);
	}
}
class Products{
public static void main(String args[])
{
 	Scanner s=new Scanner(System.in);
	int code;
	String name;
	float price;
	System.out.println("Enter product1 code:"); 
	code=s.nextInt();
	System.out.println("Enter product1 name:");
	name=s.next();
	System.out.println("Enter product1 price:");
	price=s.nextFloat();
	product p1=new product(code,name,price); 
	System.out.println("Enter product2 code:"); 
	code=s.nextInt();
	System.out.println("Enter product2 name:");
	name=s.next();
	System.out.println("Enter product2 price:");
	price=s.nextFloat();
	product p2=new product(code,name,price); 
	System.out.println("Enter product3 code:"); 
	code=s.nextInt();
	System.out.println("Enter product3 name:");
	name=s.next();
	System.out.println("Enter product3 price:");
	price=s.nextFloat();
	product p3=new product(code,name,price); 	  
	
 	System.out.println("Displaying p1");
 	p1.display();
 	System.out.println("Displaying p2");
 	p2.display();
 	System.out.println("Displaying p3"); 
 	p3.display();
	System.out.println("Displaying product with lowest price"); 
	if(p1.price<p2.price&p2.price<p3.price)
		p1.display();
	else if(p2.price<p1.price&p1.price<p3.price)
		p2.display();
	else
		p3.display();

}
}