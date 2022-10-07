package date1007;

import java.util.HashMap;
import java.util.Map;

public class SidoMap {
    private Map<Integer, String> sidoCodeName;

    public SidoMap() {
        sidoCodeName = new HashMap<>();
        sidoCodeName.put(11,"서울특별시");
        sidoCodeName.put(21,"부산광역시");
        sidoCodeName.put(22,"대구광역시");
        sidoCodeName.put(23,"인천광역시");
        sidoCodeName.put(24,"광주광역시");
        sidoCodeName.put(25,"대전광역시");
        sidoCodeName.put(26,"울산광역시");
        sidoCodeName.put(29,"세종특별자치시");
        sidoCodeName.put(31,"경기도");
        sidoCodeName.put(32,"강원도");
        sidoCodeName.put(33,"충청북도");
        sidoCodeName.put(34,"충청남도");
        sidoCodeName.put(35,"전라북도");
        sidoCodeName.put(36,"전라남도");
        sidoCodeName.put(37,"경상북도");
        sidoCodeName.put(38,"경상남도");
        sidoCodeName.put(39,"제주특별자치도");
    }

    public Map<Integer, String> getSidoCodeName() {
        return sidoCodeName;
    }
}
