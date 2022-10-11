package date1007;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
            PopulationMove pm = parse2(str);
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

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public PopulationMove parse2(String data){

        String[] dataList = data.split(",");
        int toSido = Integer.parseInt(dataList[0]); //전입
        int fromSido = Integer.parseInt(dataList[1]); //전출
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
    //List<String>을 지정한 파일에 write
    public void write(List<String> strs, String fileName){
        File file = new File(fileName);
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (String str : strs) {
                writer.write(str);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public Map<String, Integer> heatmapIdxMap() {

        Map<String, Integer> heatmapMap = new HashMap<>();
        heatmapMap.put("11", 0);
        heatmapMap.put("26", 1);
        heatmapMap.put("27", 2);
        heatmapMap.put("28", 3);
        heatmapMap.put("29", 4);
        heatmapMap.put("30", 5);
        heatmapMap.put("31", 6);
        heatmapMap.put("36", 7);
        heatmapMap.put("41", 8);
        heatmapMap.put("42", 9);
        heatmapMap.put("43", 10);
        heatmapMap.put("44", 11);
        heatmapMap.put("45", 12);
        heatmapMap.put("46", 13);
        heatmapMap.put("47", 14);
        heatmapMap.put("48", 15);
        heatmapMap.put("50", 16);
        return heatmapMap;
    }

    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml){
        Map<String, Integer> moveCntMap = new HashMap<>();

        for (PopulationMove populationMove : pml) {
            String key = populationMove.getFromSido() + "," + populationMove.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key, 1);
            } else{
                moveCntMap.put(key, moveCntMap.get(key) + 1);
            }
        }
        return moveCntMap;

    }


}
