class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = 0;

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }

        if(target > sum || target < -sum) return 0;

        int[][] dp = new int[nums.length][2 * sum + 1];

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < 2 * sum + 1; j++){
                dp[i][j] = -1;
            }
        }

        return solve(0, nums, target, dp, sum);
    }

    public int solve(int i, int[] nums, int target,
                     int[][] dp, int offset){

        if(target > offset || target < -offset){
            return 0;
        }

        if(i == nums.length){
            return target == 0 ? 1 : 0;
        }

        if(dp[i][target + offset] != -1){
            return dp[i][target + offset];
        }

        int add = solve(i + 1, nums,
                        target - nums[i], dp, offset);

        int sub = solve(i + 1, nums,
                        target + nums[i], dp, offset);

        return dp[i][target + offset] = add + sub;
    }
}