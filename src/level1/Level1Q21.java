package level1;
public class Level1Q21 {

    // See https://leetcode.com/problems/count-primes for methods of optimization
    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }
        return answer;
    }
}
