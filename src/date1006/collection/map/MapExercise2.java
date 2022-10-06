package date1006.collection.map;

import java.util.*;

public class MapExercise2 {
    public static void main(String[] args) {
        HashMap<String, Integer> alphabetCntMap = new HashMap<>();
        String repoAddr = "https://github.com/Combi153/BackEndSchool2.git";          // 깃허브 주소 문자열 초기화
        String[] alphabetList = repoAddr.split("");                           // 문자열 String 배열로 초기화
        Set<String> wordSet = new HashSet<String>(Arrays.asList(alphabetList));          // String 배열을 Set 으로 초기화
        Set<String> alphabetSet = new HashSet<String>();                                 // 대문자 알파벳 -> 소문자 알파벳, 특수문자 제외를 위해 빈 Set 초기화
        Iterator<String> ir = wordSet.iterator();                                   // 순환자 생성

        while(ir.hasNext()){                                                        // 반복문
            String str = ir.next();                                                 // 아스키 코드로 대소문자, 특수문자 찾기
            int strInt = str.charAt(0);
            if(strInt > 64 && strInt < 91){
                strInt += 32;                                                       // 대문자는 소문자로 alphabetSet 에 추가
                str = Character.toString((char)strInt);
                alphabetSet.add(str);
            } else if(strInt < 97 || strInt > 123){                                 // 특수문자는 추가하지 않음
                continue;
            } else{
                alphabetSet.add(str);                                               // 소문자는 alphabetSet 에 추가
            }
        }

        for (String s : alphabetSet) {
            int cnt = 0;
            for (String value : alphabetList) {                                     // alphabetSet 에서 각 소문자들을 불러옴
                if (s.equals(value)) {                                              // alphabetList 에서 각 소문자들의 개수를 셈
                    cnt += 1;
                }
            }
            alphabetCntMap.put(s, cnt);                                             // map 에 key, value 를 소문자, 소문자 개수로 추가
        }

        System.out.println(alphabetCntMap);
    }
}
