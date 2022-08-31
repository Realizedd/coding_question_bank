package level4;

public class Level4Q7 {
    
    private int generate(int opening, int closing, String s) {
        if (opening == 0 && closing == 0) {
            return 1;
        }
        
        int sum = 0;

        if (opening > 0) {
            sum += generate(opening - 1, closing, s + "(");
        }

        if (opening < closing && closing > 0) {
            sum += generate(opening, closing - 1, s + ")");
        }
        
        return sum;
    }

    public int solution(int n) {
        return generate(n, n, "");
    }
}
