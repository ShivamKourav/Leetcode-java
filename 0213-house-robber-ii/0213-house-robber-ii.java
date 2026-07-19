class Solution {
    public int rob(int[] nums) {

        int n = nums.length-1;

        if (n == 0) {
            return nums[0];
        }

        int case1 = robHouse(nums, 0, n - 1);
        int case2 = robHouse(nums, 1, n); 

        return Math.max(case1, case2);
    }

    public int robHouse(int[] nums, int start, int end) {

        int prev1 = 0;
        int prev2 = 0;

        for (int i = start; i <= end; i++) {
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }

        return prev1;
    }
}