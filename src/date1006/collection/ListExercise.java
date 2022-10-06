package date1006.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {

    private List<String> students;

    public ListExercise() {
        this.students = new ArrayList<>();
        students.add("김나나");
        students.add("김한솔");
        students.add("김솔한");
        students.add("이한솔");
        students.add("정한솔");
    }

    public List<String> getStudents() {
        return this.students;
    }
}
