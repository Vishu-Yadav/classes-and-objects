import java.util.*;
class Circle
{
	int radius;
	double pi=3.14;
	Circle()
	{
		radius=1;
	}
	Circle(int radius)
	{
		this.radius=radius;
	}
	void area()
	{
		System.out.println("Area is: "+(pi*radius*radius) +" ");
	}
	void circumference()
	{
		System.out.println("Circumference is" +(2*pi*radius) +" ");
	}
	void display()
	{
		System.out.println("Radius is" +radius +" ");
		area();
		circumference();
	}
}

public class CircleTest
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		Circle c1=new Circle();
		c1.display();
		System.out.println("Enter the radius: ");
		int radius=in.nextInt();
		Circle c2=new Circle(radius);
		c2.display();
	}
}