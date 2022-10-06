package date1006.collection.map;

import java.util.*;

public class MapExercise2_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> alphabetCntMap = new HashMap<>(); //HashMap 초기화
        String repoAddr = "https://github.com/Combi153/BackEndSchool2.git"; // 깃허브 주소 String 초기화
        List<String> wordList = new ArrayList<>(Arrays.asList(repoAddr.split(""))); // List에 문자 하나씩 넣기
        List<String> alphabetList = new ArrayList<>(); //대문자 -> 소문자 만들기, 특수문자 제외 하여 넣을 리스트 생성

        for (int i = 0; i < wordList.size(); i++) {  //아스키 코드를 활용하기
            String str = wordList.get(i);
            int strInt = str.charAt(0);

            if(strInt > 64 && strInt < 91){ //대문자 -> 소문자로 만들고 add
                strInt += 32;
                str = Character.toString((char)strInt);
                alphabetList.add(str);
            } else if(strInt > 96 && strInt < 123){ //소문자인 경우에만 add
                alphabetList.add(str);
            }
        }

        Set<String> alphabetSet = new HashSet<String>(alphabetList); //List 중복을 없애기 위해 Set 으로 만들기

        for (String s : alphabetSet) {
            int cnt = 0;
            for (String value : alphabetList) {
                if (s.equals(value)) {
                    cnt += 1;
                }
            }
            alphabetCntMap.put(s, cnt);
        }
        System.out.println(alphabetCntMap);
    }
}
