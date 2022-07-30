public class Level1Q32 {

    public long solution(long n) {
        double d = Math.sqrt(n);
        return d == Math.floor(d) ? (long) Math.pow(d + 1, 2) : -1;
    }
}
