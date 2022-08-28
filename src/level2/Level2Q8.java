package level2;

public class Level2Q8 {

    
    public int binarySearch(int[] arr, int n) {
        int a = 0;
        int b = arr.length - 1;

        while (b >= a) {
            int m = a + (b - a) / 2;

            if (arr[m] == n) {
                return m;
            } else if (arr[m] > n) {
                b = m - 1;
            } else {
                a = m + 1;
            }
        }

        return -1;
    }

    public int solution(int n) {
        int answer = 1;
        int size = (n / 2) + 1;
        int[] arr = new int[size];
        arr[0] = 1;

        for (int i = 1; i < size; i++) {
            arr[i] = (i + 1) + arr[i - 1];
        }

        for (int i = 0; i < size; i++) {
            int target = arr[i] - n;
            int found = binarySearch(arr, target);
            if (target == 0 || (found != -1 && found < i)) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Level2Q8 solution = new Level2Q8();
        System.out.println(solution.solution(15));
    }
}
