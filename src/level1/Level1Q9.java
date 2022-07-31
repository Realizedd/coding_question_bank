package level1;
import java.util.Arrays;

public class Level1Q9 {

    public long solution(long n) {
        int[] digits = new int[(int) Math.floor(Math.log10(n)) + 1];
        int i = 0;
        
        while (n > 0) {
            digits[i++] = (int) (n % 10);
            n /= 10;
        }

        decreasingSort(digits);
        
        long answer = 0;
        
        for (int j = 0; j < digits.length; j++) {
            answer += digits[j] * Math.pow(10, digits.length - (j + 1));
        }
        
        return answer;
    }
    
    private void decreasingSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;
            
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    public static void main(String[] args) throws Exception {
        Level1Q9 sol = new Level1Q9();

        for (long i = 1; i <= 100000000; i++) {
            String s = String.valueOf(i);
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            
            for (int j = 0; j < arr.length / 2; j++) {
                char temp = arr[j];
                arr[j] = arr[arr.length - j - 1];
                arr[arr.length - j - 1] = temp;
            }

            if (!String.valueOf(sol.solution(i)).equals(String.copyValueOf(arr))) {
                System.out.println(String.copyValueOf(arr) + ": " + sol.solution(i));
            }
        }
    }
}
