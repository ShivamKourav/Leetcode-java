import java.util.Arrays;

class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(grid, m - 1, n - 1, dp);
    }

    public int solve(int[][] grid, int i, int j, int[][] dp) {
        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }

        if (i == 0 && j == 0) {
            return grid[0][0];
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int up = solve(grid, i - 1, j, dp);
        int left = solve(grid, i, j - 1, dp);

        dp[i][j] = grid[i][j] + Math.min(up, left);

        return dp[i][j];
    }
}