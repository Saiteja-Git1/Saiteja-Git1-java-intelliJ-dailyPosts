package dayFive;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();

        student.add("alice");
        student.add("bob");
        student.add("teja");

        System.out.println(student.get(1));

        for(String students : student){
            System.out.println(students);
        }
    }
}
