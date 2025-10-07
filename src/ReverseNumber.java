import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int reverse = 0;
        int lastdigit;
        while(n>0){
             lastdigit = n%10;
             reverse = reverse * 10 + lastdigit;
             n = n/10;
        }
        System.out.println("Reversed Number is " + reverse);
    }
}
