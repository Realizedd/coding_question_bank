public class Level1Q25 {

    public long[] solution(int x, int n) {
        long[] ans = new long[n];

        for (int i = 0; i < n; i++) {
            ans[i] = i == 0 ? x : ans[i - 1] + x;
        }

        return ans;
    }
}
