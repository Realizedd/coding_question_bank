package level4;

public class Level4Q6 {

    private int maxPossibleScore;
    private boolean found = false;
    private int currentMaxScore = 0;

    public int solution(int[] left, int[] right) {
        maxPossibleScore = java.util.Arrays.stream(right).sum();
        iterate(left, right, 0, maxPossibleScore, 0, 0);
        int score = currentMaxScore;
        this.currentMaxScore = 0;
        return score;
    }

    private void iterate(int[] left, int[] right, int score, int maxPossibleScore, int li, int ri) {
        if (found) {
            return;
        }

        if (li == left.length || ri == right.length) {
            if (score == this.maxPossibleScore) {
                found = true;
            }

            currentMaxScore = Math.max(currentMaxScore, score);
            return;
        }

        if (score + maxPossibleScore < this.currentMaxScore) {
            return;
        }

        if (left[li] > right[ri]) {
            iterate(left, right, score + right[ri], maxPossibleScore - right[ri], li, ri + 1);
            return;
        }
        
        iterate(left, right, score, maxPossibleScore - right[ri], li + 1, ri + 1);
        iterate(left, right, score, maxPossibleScore, li + 1, ri);
    }
}