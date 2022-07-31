package level1;
public class Level1Q11 {

    public boolean solution(int x) {
        int n = x;
        int digitSum = 0;
        
        while (n > 0) {
            digitSum += (n % 10);
            n /= 10;
        }

        return (x % digitSum) == 0;
    }
}
