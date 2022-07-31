package level1;
import java.util.ArrayList;
import java.util.List;

public class Level1Q27 {

    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && arr[i - 1] == arr[i]) {
                continue;
            }

            list.add(arr[i]);
        }

        int[] sol = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++) {
            sol[i] = list.get(i);
        }
        
        return sol;
    }
}
