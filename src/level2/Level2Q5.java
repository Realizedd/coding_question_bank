package level2;

public class Level2Q5 {
    
    public String solution(String s) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (String num : s.split(" ")) {
            int i = Integer.parseInt(num);
            min = Math.min(min, i);
            max = Math.max(max, i);
        }
        
        return min + " " + max;
    }
}
