package date1007;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataPreprocessing {

    public String fromToString(PopulationMove populationMove){
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
    }

    public PopulationMove parse(String data){

        String[] dataList = data.split(",");
        int toSido = Integer.parseInt(dataList[0]); //전입
        int fromSido = Integer.parseInt(dataList[6]); //전출
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
    public List<PopulationMove> readByLine(String fileName) throws IOException { //다른 타입으로 하려면 어케 해야하나
        List<PopulationMove> pml = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName));

        String str;
        while ((str = br.readLine()) != null) {
            PopulationMove pm = parse(str);
            pml.add(pm);
        }
        br.close();
        return pml;
    }

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
}
