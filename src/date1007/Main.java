package date1007;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) throws IOException {

        /*DataPreprocessing preprocessor = new DataPreprocessing();
        String address = "C:\\Users\\chanmin\\Desktop\\인구관련연간자료_20221007_10150_데이터\\2021_인구관련연간자료_20221007_10150.csv";
        List<PopulationMove> pml = preprocessor.readByLine(address);
        preprocessor.createAFile("./from_to2.txt");
        List<String> strings = new ArrayList<>();
        for (PopulationMove populationMove : pml) {
            String fromTo = preprocessor.fromToString(populationMove);
            strings.add(fromTo);
        }
        preprocessor.write(strings, "./from_to2.txt");*/

/*
        String address = "C:\\Users\\chanmin\\Desktop\\인구관련연간자료_20221007_10150_데이터\\2021_인구관련연간자료_20221007_10150.csv";
*/

       /* System.out.println(pml.size());

        for (PopulationMove populationMove : pml) {
            System.out.printf("전입 : %s, 전출 : %s\n", populationMove.getFromSido(), populationMove.getToSido());
        }
        객체지향 설명
        ReadLineContext<PopulationMove> readLineContext = new ReadLineContext<>(new );
        List<PopulationMove> result = readLineContext.readByLine(address);*/
/*

        populationStatistics.createAFile("./from_to.txt");
        List<String> strings = new ArrayList<>();
        for (PopulationMove populationMove : pml) {
            String fromTo = populationStatistics.fromToString(populationMove);
            strings.add(fromTo);
        }
        populationStatistics.write(strings, "./from_to.txt");
*/
        String newAddress = "from_to2.txt";
        PopulationStatistics populationStatistics = new PopulationStatistics();
        List<PopulationMove> pml2 = populationStatistics.readByLine(newAddress);

        Map<String, Integer> moveCntMap = populationStatistics.getMoveCntMap(pml2);
        Map<String, Integer> heatMapIdxMap = populationStatistics.heatmapIdxMap();
        String targetFileName = "for_heatmap.txt";
        populationStatistics.createAFile(targetFileName);
        List<String> cntResult = new ArrayList<>();
        for (String key : moveCntMap.keySet()) {
            String[] fromTo = key.split(",");
            //String s = String.format("key : %s, value : %d\n", key, moveCntMap.get(key));
            String s = String.format("[%s, %s, %d],\n", heatMapIdxMap.get(fromTo[0]), heatMapIdxMap.get(fromTo[1]), moveCntMap.get(key));
            cntResult.add(s);
        }
        populationStatistics.write(cntResult, targetFileName);

    }

}
