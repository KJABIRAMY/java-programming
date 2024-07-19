import java.io.*;
import java.util.Scanner;
class home_address
{
public static void main(String[] args)
{
String name,f_name,street_name,area,city;
int door_no;
long pincode;
Scanner S=new Scanner(System.in);
System.out.println("enter your name:");
name=S.next();
System.out.println("enter your fathers name:");
f_name=S.next();
System.out.println("enter your door no");
door_no=S.nextInt();
System.out.println("enter your street_name:");
street_name=S.next();
System.out.println("enter your area:");
area=S.next();
System.out.println("enter your city:");
city=S.next();
System.out.println("enter your pincode:");
pincode=S.nextLong();
System.out.println("address:"+name+","+f_name +","+door_no+","+street_name+","+area+","+city+","+pincode);
}
}



