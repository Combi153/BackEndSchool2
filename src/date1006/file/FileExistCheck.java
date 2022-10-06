package date1006.file;

import java.io.File;

public class FileExistCheck {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\chanmin\\git\\BackEndSchool2\\afile.txt");
        //File file = new File("afile.txt");

        if (file.exists()){
            System.out.println("파일이 존재합니다.");
        } else{
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
