import java.util.HashMap;
import java.util.Map;

class StudentInfo {
    String name;
    Integer id;

    StudentInfo(String name, Integer id) {
        this.name = name;
        this.id = id;
    }
}

public class Studentsss {
    public static void main(String[] args) {
        Map<Integer, StudentInfo> stud = new HashMap<>();
        stud.put(11, new StudentInfo("Ash", 11));
        stud.put(12, new StudentInfo("Ravi", 12));
        stud.put(13, new StudentInfo("Ramesh", 13));
        boolean a = stud.containskey(12);
        if (a) {
            System.out.println("Yes it's present");
        } else {
            System.out.println("No it's not present");
        }
        for (Integer key : stud.keySet()) {
            System.out.println("Key: " + key +
                    " Value: " + stud.get(key).name);
        }
    }
}