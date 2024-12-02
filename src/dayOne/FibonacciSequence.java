package dayOne;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int a = 0 , b = 1;
        System.out.print( a );
        for (int i = b; i <= n ; i = a+b){
            System.out.print(","+i);
            a = b;
            b = i;

        }
    }

}
