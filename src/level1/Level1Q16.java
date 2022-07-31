package level1;
public class Level1Q16 {

    private static final String[] DAYS_OF_WEEK = {
            "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"
    };
    private static final int[] DAYS_OF_MONTH = {
            31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public String solution(int a, int b) {
        int offset = b;

        for (int i = 0; i < a - 1; i++) {
            offset += DAYS_OF_MONTH[i];
        }

        return DAYS_OF_WEEK[(offset - 1) % 7];
    }

    public static void main(String[] args) {
        Level1Q16 sol = new Level1Q16();
        System.out.println(sol.solution(5, 24));
    }
}
