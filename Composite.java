import java.io.*;
import java.util.*;

class composite {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);		
	int a,b,c=0,i,j;
	a=s.nextInt();
	b=s.nextInt();
	for(i=a;i<=b;i++)
	{
		if(i%2==0 || i%3==0 || i%5==0 || i%7==0)
		{
			System.out.println(i);
		}
	}
  }
}