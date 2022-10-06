package date1006.collection.map;

import java.util.HashMap;

public class MapExerciseMain {
    public static void main(String[] args) {
        MapExercise map = new MapExercise();
        HashMap<String, String> students = map.getMap();
        for (String s : students.keySet()) {
            System.out.println("학생 이름 : " + s + ", 주소 : " + students.get(s));
        }
    }
}
