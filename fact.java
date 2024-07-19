import java.io.*;
import java.util.Scanner;
class fact
{
public static void main(String[] args)
{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = s.nextInt();
        int f= 1;
        int i = 1;

        while (i <= n) {
            f *= i;
            i++;
        }

        System.out.println(n + " Factorial = " + f);
    }
}
