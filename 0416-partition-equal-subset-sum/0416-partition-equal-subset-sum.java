class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int elem : nums) sum += elem;
        if(sum % 2 != 0) return false;
        int target = sum / 2;
        int[][] dp = new int[nums.length][target + 1];
        for(int[] row : dp) {
            Arrays.fill(row, -1);
        }
        int ans = solve(0, nums, target, dp);
        return ans == 1;
    }

    public int solve(int i, int[] nums, int target, int[][] dp) {
        if(target == 0) return 1;
        if(i == nums.length) return 0;
        if(dp[i][target] != -1) {
            return dp[i][target];
        }
        int skip = solve(i+1, nums, target, dp);
        int take = 0;
        if(target >= nums[i]) {
            take = solve(i+1, nums, target-nums[i], dp);
        }
        dp[i][target] = (skip == 1 || take == 1) ? 1 : 0;
        return dp[i][target];
    }
}
