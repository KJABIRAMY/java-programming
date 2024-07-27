import java.io.*;
import java.util.*;

class Rectangle
{
    int length, breadth;

    Rectangle()
    {
        length = 0;
        breadth = 0;
    }

    Rectangle(int length, int breadth) 
   {
   this.length=length;
   this.breadth=breadth;
   }

    Rectangle(int side)
    {
    length=side;
    breadth=side;
    }

    int calculateArea()
    {
        return length * breadth;
    }
}
class area
{
 public static void main(String[] args)
 {	
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(5,5);
        Rectangle rect3 = new Rectangle(4);

        System.out.println("Area of rect1: " + rect1.calculateArea());
        System.out.println("Area of rect2: " + rect2.calculateArea());
        System.out.println("Area of rect3: " + rect3.calculateArea());
    }
}



