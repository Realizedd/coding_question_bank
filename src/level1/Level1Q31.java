package level1;
public class Level1Q31 {

    public long solution(long num) {
        int n = 0;

        while (num != 1 && n < 500) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = 3 * num + 1;
            }
            n++;
        }

        return num != 1 ? -1 : n;
    }

    public static void main(String[] args) {
        Level1Q31 sol = new Level1Q31();
        System.out.println(sol.solution(626331));
    }
}
