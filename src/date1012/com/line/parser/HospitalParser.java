package date1012.com.line.parser;


import date1012.com.line.domain.Hospital;

public class HospitalParser implements Parser<Hospital>{
    @Override
    public Hospital parse(String strRow) {
        String[] strArray = strRow.split(",");
        Hospital hospital = new Hospital(strArray);
        return hospital;
    }
}
