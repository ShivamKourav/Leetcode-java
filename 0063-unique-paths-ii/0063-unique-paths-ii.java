class Solution {
    public int uniquePathsWithObstacles(int[][] nums) {
        int m = nums.length;
        int n = nums[0].length;

        int[][] dp = new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(nums, 0, 0, dp);
    }

    public int solve(int[][] nums, int i, int j, int[][] dp) {
        int m = nums.length;
        int n = nums[0].length;

        if (i >= m || j >= n) return 0;

        if (nums[i][j] == 1) return 0;

        if (i == m - 1 && j == n - 1) return 1;

        if (dp[i][j] != -1) return dp[i][j];

        int down = solve(nums, i + 1, j, dp);
        int right = solve(nums, i, j + 1, dp);

        return dp[i][j] = down + right;
    }
}