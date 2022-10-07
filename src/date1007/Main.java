package date1007;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        String address = "C:\\Users\\chanmin\\Desktop\\인구관련연간자료_20221007_10150_데이터\\2021_인구관련연간자료_20221007_10150.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();
   /*     List<PopulationMove> pml = populationStatistics.readByLine(address);
        System.out.println(pml.size());

        for (PopulationMove populationMove : pml) {
            System.out.printf("전입 : %s, 전출 : %s\n", populationMove.getFromSido(), populationMove.getToSido());
        }*/
       /*
        ReadLineContext<PopulationMove> readLineContext = new ReadLineContext<>(new );
        List<PopulationMove> result = readLineContext.readByLine(address);
        */
        populationStatistics.createAFile("./from_to.txt");

    }

}
