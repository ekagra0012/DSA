package Patterns;

import java.util.Scanner;

public class patterns {
    static void main() {
        System.out.println("enter number of rows: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nst; j++) {
                System.out.print("*");
            }
            nst++;
            System.out.println();

        }

    }
}
