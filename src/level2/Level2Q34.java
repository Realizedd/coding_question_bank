package level2;

public class Level2Q34 {

    private double lineEquation(double w, double h, double x) {
        return -(h / w) * x + h;
    }

    public long solution(int w, int h) {
        long answer = 0;

        for (int i = 0; i < w; i++) {
            System.out.println(Math.ceil(lineEquation(w, h, i) - lineEquation(w, h, i + 1)));
            answer += Math.ceil(lineEquation(w, h, i) - lineEquation(w, h, i + 1));
        }

        return w * h - answer;
    }

    public static void main(String[] args) {
        Level2Q34 solution = new Level2Q34();
        System.out.println(solution.solution(7, 3));
    }
}
