package date1007;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

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

    public void readByLine(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }

    public String readLine(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(fileName));
        String line = br.readLine();
        br.close();
        return line;
    }

    public PopulationMove parse(String data){
        //0, 6
        String[] dataList = data.split(",");
        int fromSido = Integer.parseInt(dataList[0]);
        int toSido = Integer.parseInt(dataList[6]);
        System.out.println(fromSido + " " + toSido);
        return new PopulationMove(fromSido, toSido);
    }

    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\chanmin\\Desktop\\인구관련연간자료_20221007_10150_데이터\\2021_인구관련연간자료_20221007_10150.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        //populationStatistics.readByLine2(address);
        populationStatistics.parse(populationStatistics.readLine(address));
    }
}
