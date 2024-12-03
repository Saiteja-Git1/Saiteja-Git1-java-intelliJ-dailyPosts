package dayFive;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> grades = new HashMap<>();
        grades.put("Sai",99);
        grades.put("teja",77);
        grades.put("bob",89);

        System.out.println(grades.get("teja"));

        for(String student : grades.keySet()){
            System.out.println(student + "'s grade : "+grades.get(student));
        }
    }
}
