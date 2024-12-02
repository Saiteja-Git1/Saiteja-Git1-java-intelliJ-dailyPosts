package dayTwo;

public class ReverseOfArray {
    public static void reverseOfArray(int[] arr ){
        //int[] arr = {10,20,4,99};

        int start = 0;
        int  end = arr.length - 1;
        while(start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int i : arr)
        {
            System.out.print(i+" ");
        }

    }

    public static void main(String[] args) {
        int[] a ={10,99,55,77,88};
        reverseOfArray(a);
    }
}
