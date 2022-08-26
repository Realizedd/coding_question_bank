package level2;

public class Level2Q6 {

    public int findInsertPosition(int[] arr, int n) {
        int a = 0;
        int b = arr.length - 1;

        while (b >= a) {
            int m = a + (b - a) / 2;

            if (arr[m] == n) {
                while (m >= 0 && arr[m] == n) {
                    m--;
                }

                return m + 1;
            } else if (arr[m] > n) {
                b = m - 1;
            } else {
                a = m + 1;
            }
        }

        return b;
    }

    public int solution(int[] citations) {
        int maxH = 0;

        java.util.Arrays.sort(citations);

        for (int i = 1; i <= citations.length; i++) {
            int pos = findInsertPosition(citations, i);
            int eqOrGreater = citations.length - (pos + 1);

            if (citations[pos] == i) eqOrGreater++;

            if (eqOrGreater >= i) {
                maxH = i;
            }   
        }

        return maxH;
    }

    
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 5, 7, 9, 9 };
        Level2Q6 solution = new Level2Q6();
        System.out.println(solution.findInsertPosition(arr, 4));
    }
}
