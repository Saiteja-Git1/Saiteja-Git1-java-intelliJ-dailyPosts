package daySix;

public class ArrayExceptionHandling {
    public static void main(String[] args) {
        int[] num = {0,1,2,3};

        try {
            System.out.println("Accesing index 4: "+num[7]);
        }catch (Exception e){
            System.out.println("exception: "+e.getMessage());
        }
        finally {
            System.out.println("execution completed");
        }
    }
}
