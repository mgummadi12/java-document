package constructor;
import java.util.*;
public class Shape 
{
    static int length; // intance variable
    public Shape() //Default constructor
    {
    	System.out.println("this is shape class constructor  ");
    }
    public void shape(int length) //parameterized constructor
    {
    	this.length=length;
    	
    	System.out.println("lenth of the rectangle is  "+length);
    }
    public void shape(double pi,int radius)
    {
    	System.out.println("Radius of the circle is  "+radius);
    	double area = pi*radius*radius;
    	System.out.println("Area of circle is  "+area);
    }
    
    
    
    public static void display()
    {
    	System.out.println("this is display method  ");
    	
    }
	public static void main(String[] args) {
		 
		Shape.display();
		
		Shape.length=22;
		

	}

}
