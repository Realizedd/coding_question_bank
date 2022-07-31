package level1;
public class Level1Q12 {

    public String solution(String s, int n) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int m = n;

            if (c == ' ') {
                builder.append(c);
                continue;
            }

            char next = (char) ((int) c + m);

            if (Character.isLowerCase(c) && next > 'z') {
                c = 'a';
                m = next - 'z' - 1;
            } else if (Character.isUpperCase(c) && next > 'Z') {
                c = 'A';
                m = next - 'Z' - 1;
            }

            builder.append((char) ((int) c + m));
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        Level1Q12 sol = new Level1Q12();
        System.out.println(sol.solution("aBzaBzaBzaBzaBzaBzaBz", 4));
    }
}
