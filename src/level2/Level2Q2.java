package level2;

import java.util.HashSet;
import java.util.Set;

public class Level2Q2 {

    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>();

        for (String phone : phone_book) {
            set.add(phone);
        }

        for (String phone : phone_book) {
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < phone.length() - 1; i++) {
                builder.append(phone.charAt(i));

                if (set.contains(builder.toString())) {
                    return false;
                }
            }
        }

        return true;
    }
}
