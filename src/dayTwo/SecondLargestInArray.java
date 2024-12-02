package dayTwo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] a = {2,7,10,1,4,9};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        System.out.println(a[a.length - 2]);
    }
}
