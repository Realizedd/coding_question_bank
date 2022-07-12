import java.util.Arrays;
import java.util.Comparator;

public class Level1Q13 {

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                int nthCharComp = Character.compare(s1.charAt(n), s2.charAt(n));

                if (nthCharComp == 0) {
                    return s1.compareTo(s2);
                }

                return nthCharComp == 0 ? s1.compareTo(s2) : nthCharComp;
            }
            
        });
        return strings;
    }

    public static void main(String[] args) {
        Level1Q13 sol = new Level1Q13();
        System.out.println(Arrays.toString(sol.solution(new String[] {"abce", "abcd", "cdx"}, 2)));
    }
}
