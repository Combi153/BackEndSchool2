package date1006.collection.list;

import java.util.List;

public class ListExerciseMain {
    public static void main(String[] args) {
        ListExercise listExercise = new ListExercise();
        List<String> students = listExercise.getStudents(); //변수로 빼놓는 것이 편하다.
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println(students.size());
    }
}
