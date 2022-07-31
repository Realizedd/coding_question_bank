package level1;
public class Level1Q14 {

    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = (n * m) / gcd(n, m);
        return new int[] {lcm, gcd};
    }

    private int gcd(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        int mod = max % min;
        return mod == 0 ? min : gcd(min, mod);
    }
}
