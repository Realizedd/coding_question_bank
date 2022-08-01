package level4;

public class Level4Q6 {

    private int maxScore = 0;

    public int solution(int[] left, int[] right) {
        iterate(left, right, 0, 0, 0);
        int score = maxScore;
        maxScore = 0;
        return score;
    }

    private void iterate(int[] left, int[] right, int score, int li, int ri) {
        if (li == left.length || ri == right.length) {
            maxScore = Math.max(maxScore, score);
            return;
        }

        if (left[li] > right[ri]) {
            iterate(left, right, score + right[ri], li, ri + 1);
        } else if (left[li] == right[ri]) {
            iterate(left, right, score, li + 1, ri + 1);
        } else {
            iterate(left, right, score, li + 1, ri);
        }
    }
}