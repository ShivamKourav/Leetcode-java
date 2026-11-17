class Solution {
    public long maxScore(int[] nums, int x) {
        long[][] dp = new long[nums.length][2];
        for(int i = 0; i < dp.length; i++) {
            for(int j = 0; j < 2; j++) {
                dp[i][j] = Long.MIN_VALUE;
            }
        }        
        return nums[0] + solve(1, nums, x, nums[0] % 2, dp);
    }
    public long solve(int i, int[] nums, int x, int parity, long[][] dp) {
        if (i == nums.length) return 0;
        long pick = 0;
        if(dp[i][parity] != Long.MIN_VALUE) return dp[i][parity];
        if (nums[i] % 2 == parity) {
            pick = nums[i] + solve(i + 1, nums, x, parity, dp);
        } 
        else {
            pick = nums[i] - x + solve(i + 1, nums, x, nums[i] % 2, dp);
        }
        long skip = solve(i + 1, nums, x, parity, dp);
        return dp[i][parity] = Math.max(pick, skip);
    }
}