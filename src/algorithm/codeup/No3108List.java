package algorithm.codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Mountain{
    int mountainCode;
    String name;

    public Mountain(int mountainCode, String name) {
        this.mountainCode = mountainCode;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "mountainCode=" + mountainCode +
                ", name='" + name + '\'' +
                '}';
    }
}

public class No3108List {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Mountain> data = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] rowData = br.readLine().split(" ");
            if (rowData[0].equals("I")){
                data.add(new Mountain(Integer.parseInt(rowData[1]), rowData[2]));
            }
        }
    }
}
