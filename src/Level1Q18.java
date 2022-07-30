public class Level1Q18 {

    public int solution(String s) {
        boolean neg = false;
        int sum = 0;

        for (int i = s.length() - 1, j = 0; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '+' || (c == '-')) {
                neg = c == '-';
                continue;
            }

            sum += Math.pow(10, j++) * Character.digit(c, 10);
        }

        return neg ? -sum : sum;
    }
}
