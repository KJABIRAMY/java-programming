import java.io.*;
import java.util.*;
class Student {
    private String name;

    Student() {
        this.name = "Unknown";
    }
    Student(String name) {
        this.name = name;
    }
     void printName() {
        System.out.println("Name: " + name);
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.printName();
        Student student2 = new Student("John Doe");
        student2.printName();

        Student student3 = new Student("Jane Smith");
        student3.printName();
    }
}