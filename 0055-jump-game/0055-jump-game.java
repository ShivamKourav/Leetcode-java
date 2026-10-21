
class Solution {
    public boolean canJump(int[] nums) {
        int[] dp = new int[nums.length];

        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }

        return solve(nums, 0, dp);
    }

    public boolean solve(int[] nums, int index, int[] dp) {
        if (index == nums.length - 1) {
            return true;
        }

        if (dp[index] != -1) {
            return dp[index] == 1;
        }
        for (int jump = 1;
             jump <= nums[index] && index + jump < nums.length;
             jump++) {

            if (solve(nums, index + jump, dp)) {
                dp[index] = 1;
                return true;
            }
        }
        dp[index] = 0;
        return false;
    }
}
