package level4;

public class Level4Q6 {

    private int maxPossibleScore;
    private int currentMaxScore = 0;

    public int solution(int[] left, int[] right) {
        int largest = left[0];

        for (int l : left) {
            if (l > largest) {
                largest = l;
            }
        }

        int[] leftLargestAtIndex = new int[left.length];
        int curRangeLargest = largest;

        for (int i = 0; i < left.length; i++) {
            leftLargestAtIndex[i] = curRangeLargest;

            if (left[i] == curRangeLargest && i < left.length - 1) {
                curRangeLargest = left[i + 1];

                if (i < left.length - 2) {
                    for (int j = i + 2; j < left.length; j++) {
                        if (left[j] > curRangeLargest) {
                            curRangeLargest = left[j];
                        }
                    }
                }
            }
        }

        maxPossibleScore = java.util.Arrays.stream(right).sum();
        iterate(left, right, leftLargestAtIndex, 0, maxPossibleScore, 0, 0);
        int score = currentMaxScore;
        this.currentMaxScore = 0;
        return score;
    }

    private void iterate(int[] left, int[] right, int[] leftLargestAtIndex, int score, int maxPossibleScore, int li, int ri) {
        if (li == left.length || ri == right.length) {
            currentMaxScore = Math.max(currentMaxScore, score);
            return;
        }

        if (score + maxPossibleScore < this.currentMaxScore) {
            return;
        }

        if (right[ri] < left[li]) {
            iterate(left, right, leftLargestAtIndex, score + right[ri], maxPossibleScore - right[ri], li, ri + 1);
            return;
        }
        
        iterate(left, right, leftLargestAtIndex, score, maxPossibleScore - right[ri], li + 1, ri + 1);

        if (right[ri] > leftLargestAtIndex[li]) {
            return;
        }

        iterate(left, right, leftLargestAtIndex, score, maxPossibleScore, li + 1, ri);
    }
}