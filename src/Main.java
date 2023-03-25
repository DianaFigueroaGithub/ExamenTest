import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List students = new ArrayList<String>(Arrays.asList("Juan","Leonardo", "Patricia", "Diego", "Elizabeth", "Maria", "Rosa"));
        students.add("Luis");
        students.add("Mariel");
        students.add("Enrique");

        Iterator iterator = students.iterator();

        while (iterator.hasNext()) {
            System.out.println("Student: " + iterator.next());
        }

        //System.out.println(students);
    }
}
