package date1005.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    /*
    멋사 2기 학생 이름이 들어있는 list를 반환하자.
     */
    private LikeLion2thNames names = new LikeLion2thNames();
    private List<String> students;

    public LikeLion2th() {
        students = names.getNameList();
    }

    public List<String> getStudentList() {
        return this.students;
    }
}
