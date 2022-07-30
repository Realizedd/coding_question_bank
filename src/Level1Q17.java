public class Level1Q17 {

    public String solution(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length - 1; i++) {
            int maxIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            char temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
        }

        return String.copyValueOf(arr);
    }
}
