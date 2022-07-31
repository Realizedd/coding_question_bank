package level1;
public class Level1Q20 {

    public int solution(int[] d, int budget) {
        java.util.Arrays.sort(d);
        int max = 0;

        for (int i = 0; i < d.length; i++) {
            if (budget - d[i] < 0) {
                break;
            }

            budget -= d[i];
            max++;
        }

        return max;
    }
}
