package BASICS;
import java.util.Scanner;

public class PrimeNumber {
     public static void main(String[] args) {
        boolean flag = false;
        System.out.println("enter number for prime ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) System.out.println("Not a prime number");
        else System.out.println("Prime number");
}

}
