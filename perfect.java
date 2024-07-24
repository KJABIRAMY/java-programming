import java.util.*;

class perfect {
    public static void main(String[] args) {
        int range = 50, i, a, sum = 0;
        System.out.println("Perfect square numbers up to " + range + " are: ");
        for (i = 0; i*i<= range; i++) {
            a = i * i;
            System.out.print(a + " ");
            if (a < 10) {
                sum += a;
            }
        }
        System.out.println("\nThe sum of perfect square numbers less than 10 is: " + sum);
    }
}