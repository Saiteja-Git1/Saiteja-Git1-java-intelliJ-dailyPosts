package dayFive;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        int[] arr = {3,6,6,1,3,2,3,1,1,9,0};

        HashSet<Integer> num = new HashSet<>();

        for (int uniq : arr){
            num.add(uniq);
        }

        System.out.println(num);
    }
}
