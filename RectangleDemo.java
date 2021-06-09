class Rectangle
{
double length;
double breadth;
double setData(double x,double y)
 {
	length=x;
	breadth=y;
 }
double getArea()
 {
	double area=length*breadth;
	return area;
 }

}

class RectangleDemo
{
public static void main(String args[])
 {
double area;
Rectangle r1=new Rectangle();
r1.setData(12.4,13);
area=r1.getArea();
System.out.println("Area of Rectangle1="+area);
Rectangle r2=new Rectangle();
r2.setData(10.5,9);
area=r2.getArea();
System.out.println("Area of Rectangle2="+area);
Rectangle r3=new Rectangle();
r3.setData(13,14);
area=r3.getArea();
System.out.println("Area of Rectangle3="+area);
 }

}
