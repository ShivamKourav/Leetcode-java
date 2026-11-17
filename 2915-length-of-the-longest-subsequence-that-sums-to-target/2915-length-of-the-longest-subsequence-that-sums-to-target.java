class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int[][] dp = new int[nums.size()][target + 1];

        for(int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], -2);
        }
        int ans = solve(0, nums, target,dp);
        if(ans>-1) return ans;
        else return -1;
    }

    public int solve(int i, List<Integer> nums, int target, int[][] dp) {

        if(target == 0) return 0;

        if(i == nums.size()) return -1000000;

        if(dp[i][target] != -2) return dp[i][target];

        int skip = dp[i][target] = solve(i + 1, nums, target, dp);

        int take = -1000000;

        if(nums.get(i) <= target) {
            take = 1 + solve(i + 1, nums, target - nums.get(i), dp);
        }

        return dp[i][target] = Math.max(take, skip);
    }
}