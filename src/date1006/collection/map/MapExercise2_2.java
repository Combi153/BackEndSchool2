package date1006.collection.map;

import java.util.*;

public class MapExercise2_2 {
    public static void main(String[] args) {
        HashMap<String, Integer> alphabetCntMap = new HashMap<>();
        String repoAddr = "https://github.com/Combi153/BackEndSchool2.git";
        List<String> wordList = new ArrayList<>(Arrays.asList(repoAddr.split("")));
        List<String> alphabetList = new ArrayList<>();
        Set<String> alphabetSet = new HashSet<String>(alphabetList);

        for (int i = 0; i < wordList.size(); i++) {
            String str = wordList.get(i);
            int strInt = str.charAt(0);
            System.out.println(str);
            if(strInt > 64 && strInt < 91){
                strInt += 32;
                str = Character.toString((char)strInt);
                alphabetList.add(str);
            } else if(strInt > 96 && strInt < 123){
                alphabetList.add(str);
            }
        }

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
