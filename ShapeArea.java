import java.io.*;
import java.util.*;

class ShapeArea {
     void printArea(int side) {
        System.out.println("Area of square: " + side * side);
    }

     void printArea(int length, int breadth) {
        System.out.println("Area of rectangle: " + length * breadth);
    }

    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea();
        shape.printArea(5);
        shape.printArea(4, 6);
    }
}