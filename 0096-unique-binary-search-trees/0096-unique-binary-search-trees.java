
class Solution {
    public int numTrees(int n) {
        int[] dp = new int[n+1];
        return solve(n, dp);
    }
    public int solve(int n, int[] dp) {
        if(n <= 1) return 1;
        if(dp[n] != 0) return dp[n];
        int ans = 0;
        for(int j = 1; j <= n; j++) {
            ans += solve(j-1, dp) * solve(n-j, dp);
        }
        return dp[n] = ans;
    }
}
