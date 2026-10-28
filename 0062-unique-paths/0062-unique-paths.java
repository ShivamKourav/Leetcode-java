class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }        
        return count(0,0,m,n,dp);
    }
    public int count(int row, int col, int m, int n, int[][] dp){
        if(row>=m || col>=n) return 0;
        if(row == m-1 && col == n-1) return 1;
        if(dp[row][col] != -1) return dp[row][col];
        return dp[row][col] = count(row+1,col,m,n,dp)+count(row,col+1,m,n,dp);
    }
}