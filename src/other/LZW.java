package other;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class LZW {

    public int[] solution(String msg) {
        List<Integer> ans = new ArrayList<>();
        Map<String, Integer> dict = new HashMap<>();

        for (int i = 0; i <= 25; i++) {
            dict.put(Character.toString((char) (65 + i)), i + 1);
        }

        String cur = "";
        Queue<Character> queue = new LinkedList<>();

        for (char c : msg.toCharArray()) {
            queue.add(c);
        }

        while (!queue.isEmpty()) {
            cur += queue.poll();

            if (!queue.isEmpty()) {
                String key = cur + queue.peek();

                if (!dict.containsKey(key)) {
                    ans.add(dict.get(cur));
                    dict.put(key, dict.size() + 1);
                    cur = "";
                }
            } else {
                ans.add(dict.get(cur));
            }
        }

        int[] answer = new int[ans.size()];

        for (int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        LZW lzw = new LZW();
        System.out.println(Arrays.toString(lzw.solution("TOBEORNOTTOBEORTOBEORNOT")));
    }
}
