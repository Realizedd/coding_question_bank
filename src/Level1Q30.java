public class Level1Q30 {

    private boolean canLend(int lenderNum, int borrowerNum) {
        return Math.abs(lenderNum - borrowerNum) == 1;
    }

    // Surely not the most optimized solution...
    public int solution(int n, int[] lost, int[] reserve) {
        int ans = n - lost.length;

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] == lost[i]) {
                    ans++;
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            if (lost[i] < 0) {
                continue;
            }
            
            int borrowerIndex = -1;
            
            for (int j = 0; j < reserve.length; j++) {            
                if (reserve[j] < 0) {
                    continue;
                }
                
                if (canLend(reserve[j], lost[i])) {
                    borrowerIndex = j;
                    break;
                }
            }
            
            if (borrowerIndex >= 0) {
                reserve[borrowerIndex] = -1;
                ans++;
            }
        }

        return ans;
    }
}
