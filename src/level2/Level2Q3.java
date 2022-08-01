package level2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Level2Q3 {

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
    
    public int solution(int[] nums) {
        Arrays.sort(nums);
        
        int count = 0;
        Set<Integer> foundPrimes = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    
                    if (sum % 2 == 0 || (!foundPrimes.contains(sum) && !isPrime(sum))) {
                        continue;
                    }

                    foundPrimes.add(sum);
                    count++;
                }
            }
        }

        return count;
    }
}
