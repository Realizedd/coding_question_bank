package level4;

import java.util.ArrayList;
import java.util.List;

public class Level4Q10 {

    private int recElimination(List<String> list) {
        if (list.size() == 1) {
            System.out.println(list.get(0));
            return Integer.parseInt(list.get(0));
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size() / 2; i++) {
            List<String> newList = new ArrayList<>(list.subList(0, 2 * i));
            int first = Integer.parseInt(list.get(2 * i));
            int second = Integer.parseInt(list.get(2 * i + 2));
            newList.add(String.valueOf(list.get(2 * i + 1).equals("+") ? first + second : first - second));
            newList.addAll(list.subList(2 * i + 3, list.size()));
            max = Math.max(max, recElimination(newList));
        }

        return max;
    }

    public int solution(String arr[]) {
        List<String> list = new ArrayList<>();
        
        for (String s : arr) {
            list.add(s);
        }

        return recElimination(list);
    }

    public static void main(String[] args) {
        Level4Q10 sol = new Level4Q10();
        String[] arr = {"1", "-", "3", "+", "5", "-", "8"};
        System.out.println(arr.length);
        System.out.println(sol.solution(arr));
    }
}
