import java.io.*;
import java.util.*;

class max_no
{
int a,b,c;
void cal()
{
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
c=s.nextInt();
if(a>b&&a>c)
{
System.out.println("a is max");
}           
else if(b>a&&b>c)
{
System.out.println("b is max");
}
else
{
System.out.println("c is max");
}
}
}

class max_three
{
public static void main(String[] args)
{
max_no m=new max_no();
m.cal();
}
}
   