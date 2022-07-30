public class Level1Q33 {

    public String solution(String phone_number) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < phone_number.length(); i++) {
            builder.append(i < phone_number.length() - 4 ? '*' : phone_number.charAt(i));
        }

        return builder.toString();
    }
}
