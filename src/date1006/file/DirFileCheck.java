package date1006.file;

import java.io.File;

public class DirFileCheck {
    public static void main(String[] args) {
        // 현재 디렉토리의 첫번째 파일명
        File dir = new File("./");
        File[] files = dir.listFiles();
        System.out.println(files[0]);

        // 현재 디렉토리의 파일 목록
        for (File file : files) {
            System.out.println(file);
        }
    }
    /*
    .\.git
    .\.git
    .\.gitignore
    .\.idea
    .\afile.txt
    .\java-project-push-exercise.iml
    .\out
    .\src
     */
}
