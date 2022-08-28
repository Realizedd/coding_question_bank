package level2;

public class Level2Q34 {

    private double lineEquation(double w, double h, double x) {
        return -h * x / w;
    }

    public long solution(long w, long h) {
        long answer = 0;

        for (long i = 0; i < w; i++) {
            answer += Math.ceil(lineEquation(w, h, i) - Math.floor(lineEquation(w, h, i + 1)));
        }

        return w * h - answer;
    }

    public static void main(String[] args) {
        Level2Q34 solution = new Level2Q34();
        System.out.println(solution.solution(8, 12));
    }
}
