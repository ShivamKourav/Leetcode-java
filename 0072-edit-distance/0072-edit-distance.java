class Solution {
    public int solve(int i, int j, StringBuilder a, StringBuilder b, int[][] dp){
        if(i == -1) return j+1;
        if(j == -1) return i+1;
        if(dp[i][j] != -1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j))
            return dp[i][j] = solve(i-1,j-1,a,b,dp);
        else{
            int del = solve(i-1,j,a,b,dp);
            int ins = solve(i,j-1,a,b,dp);
            int rep = solve(i-1,j-1,a,b,dp);
            return dp[i][j] = 1 + Math.min(del,Math.min(ins,rep));
        }
    }
    public int minDistance(String word1, String word2) {
        StringBuilder a = new StringBuilder(word1);
        StringBuilder b = new StringBuilder(word2);
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) dp[i][j] = -1;
        }
        return solve(m-1,n-1,a,b,dp);
    }
}