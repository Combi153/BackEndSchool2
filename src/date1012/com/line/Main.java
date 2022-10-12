package date1012.com.line;

import date1012.com.line.domain.Hospital;
import date1012.com.line.parser.HospitalParser;
import date1012.com.line.parser.LineReader;
import date1012.com.line.writer.HospitalWriter;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new HospitalParser(), true);
        String filename = "C:\\Users\\chanmin\\Desktop\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalLineReader.readLines(filename);

        String targetName = "hospital.txt";
        HospitalWriter writer = new HospitalWriter(targetName);
        writer.writeSql(hospitals);
    }
}
