class Solution {
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = sb.length();
        int[][] dp = new int[n+1][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) dp[i][j] = -1;
        }
        return solve(0,n-1,sb,dp);
    }
    public int solve(int i, int j, StringBuilder sb, int dp[][]){
        if(i>j) return 0;
        if (i == j) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        if(sb.charAt(i) == sb.charAt(j)){
            return dp[i][j] = 2 + solve(i+1,j-1,sb,dp);
        }
        else 
            return dp[i][j] = Math.max(solve(i,j-1,sb,dp),solve(i+1,j,sb,dp));
    }
}