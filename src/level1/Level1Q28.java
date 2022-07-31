package level1;
public class Level1Q28 {

    public String solution(int n) {
        StringBuilder ans = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            ans.append(i % 2 != 0 ? "수" : "박");
        }

        return ans.toString();
    }
}
