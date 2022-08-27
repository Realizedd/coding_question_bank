package level2;

public class Level2Q7 {

    private int recSearch(int[] nums, int target, int index, int sum) {
        if (index == nums.length) {
            if (sum == target) {
                return 1;
            }

            return 0;
        }

        return recSearch(nums, target, index + 1, sum + nums[index]) + recSearch(nums, target, index + 1, sum - nums[index]);
    }

    public int solution(int[] nums, int target) {
        return recSearch(nums, target, 0, 0);
    }

    public static void main(String[] args) {
        Level2Q7 solution = new Level2Q7();
        int[] arr = {1,2,3,4,5};
        System.out.println(solution.solution(arr, 3));
    }
}
