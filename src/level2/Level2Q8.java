package level2;

public class Level2Q8 {

    private int sum(int a, int b) {
        return ((b - a + 1) * (a + b)) / 2;
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n / 2; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (sum(i, j) == n) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
