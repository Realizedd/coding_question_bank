package level1;
public class Level1Q29 {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder(Character.toString(s.charAt((s.length() - 1) / 2)));

        if (s.length() % 2 == 0) {
            answer.append(s.charAt(s.length() / 2));
        }

        return answer.toString();
    }
}
