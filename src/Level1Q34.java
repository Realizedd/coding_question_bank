import java.util.HashMap;
import java.util.Map;

public class Level1Q34 {

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String s : completion) {
            Integer val = map.getOrDefault(s, 0);
            map.put(s, ++val);
        }

        for (String s : participant) {
            Integer val = map.get(s);

            if (val == null || val == 0) {
                return s;
            }

            map.put(s, --val);
        }
        
        return null;
    }
}
