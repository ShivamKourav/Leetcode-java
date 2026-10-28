class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return Math.min(mincost(cost, n - 1, dp), mincost(cost, n - 2, dp));
    }
    public int mincost(int[] cost, int i, int[] dp) {
        if (i == 0 || i == 1) {
            return cost[i];
        }
        if(dp[i] != -1) return dp[i];
        return dp[i] = cost[i] + Math.min(mincost(cost,i - 1,dp),mincost(cost,i - 2,dp));
    }
}
