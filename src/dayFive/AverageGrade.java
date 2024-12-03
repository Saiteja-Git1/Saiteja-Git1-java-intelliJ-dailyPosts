package dayFive;

import java.util.HashMap;

public class AverageGrade {
    public static void main(String[] args) {
        HashMap<String,Integer> grades = new HashMap<>();
        grades.put("Alies",99);
        grades.put("bob",99);
        grades.put("charlie",70);

        int total = 0;
        for (int grade : grades.values()){
            total = total + grade;
        }

        double avg = (double) total/grades.size();
        System.out.println(avg);

    }
}
