package level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Level3Q1 {

    public String[] solution(String[][] tickets) {
        Map<String, TreeMap<String, Integer>> map = new HashMap<>();

        for (String[] pair : tickets) {
            TreeMap<String, Integer> treeMap = map.computeIfAbsent(pair[0], res -> new TreeMap<>());
            treeMap.put(pair[1], treeMap.getOrDefault(pair[1], 0) + 1);
        }

        List<String> ans = new ArrayList<>();
        String cur = "ICN";
        ans.add(cur);

        while (!map.isEmpty()) {
            TreeMap<String, Integer> treeMap = map.get(cur);
            Map.Entry<String, Integer> next = treeMap.firstEntry();

            if (next.getValue() <= 1) {
                treeMap.remove(next.getKey());
            } else {
                treeMap.put(next.getKey(), next.getValue() - 1);
            }

            if (treeMap.isEmpty()) {
                map.remove(cur);
            }

            ans.add(next.getKey());
            cur = next.getKey();
        }

        return ans.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Level3Q1 solution = new Level3Q1();
        String[][] arr = { { "ICN", "JFK" }, { "HND", "IAD" }, { "JFK", "HND" } };
        String[][] arr2 = { { "ICN", "SFO" }, { "ICN", "ATL" }, { "SFO", "ATL" }, { "ATL", "ICN" }, { "ATL", "SFO" } };
        System.out.println(Arrays.toString(solution.solution(arr)));
    }
}
