package dayTwo;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] a = new int[n] ;

        System.out.println("Enter the numbers in array : ");

        for (int i = 0; i < n ; i++) {
            a[i] = sc.nextInt();
        }

        int sum = 0;
//        for (int j : a) {
//            sum = sum + j;
//        }
        for (int j = 0; j < a.length ; j++)
        {
            sum += a[j];
        }

        System.out.println(sum);
    }
}
