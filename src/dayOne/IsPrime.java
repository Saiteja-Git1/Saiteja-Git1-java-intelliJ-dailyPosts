package dayOne;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check its prime or not : ");
        int n =sc.nextInt();

        if (n <= 1) {
            System.out.println("it is not a prime number");
        }else {
            boolean isPrime = true;
            for (int i = 2; i <= n/2 ; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                System.out.println("YESS...it is a prime number");
            }else {
                System.out.println("NOO..it is not a prime number");
            }
        }

    }
}
