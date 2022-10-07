package date1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    public void readByLine2(String filename) {
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get(filename), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readByCharacter(String fileName) throws IOException {
        FileReader fileReader = new FileReader(fileName); //파일 읽지 않는다.

        String fileContents = "";
        while (fileContents.length() < 1000) {
            char c = (char)fileReader.read();
            fileContents += c;
        }
        System.out.println(fileContents);
    }

    public List<PopulationMove> readByLine(String fileName) throws IOException { //다른 타입으로 하려면 어케 해야하나
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String str;
        while ((str = br.readLine()) != null) {
            //System.out.println(str);
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        br.close();
        return pml;
    }

    public String readLine(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        br.close();
        return line;
    }

    public PopulationMove parse(String data){

        String[] dataList = data.split(",");
        int toSido = Integer.parseInt(dataList[0]); //전입
        int fromSido = Integer.parseInt(dataList[6]); //전출
        //System.out.println(fromSido + " " + toSido);
        return new PopulationMove(fromSido, toSido);
    }

    public void createAFile(String filename) {
        File file = new File(filename);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
