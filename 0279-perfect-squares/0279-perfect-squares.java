class Solution {
    public boolean isPerfect(int n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == n;
    }

    public int solve(int n, int[] dp) {

        if (isPerfect(n))
            return 1;

        if (dp[n] != 0)
            return dp[n];

        int min = Integer.MAX_VALUE;

        for (int i = 1; i*i <= n / 2; i++) {

            int count = 1 + solve(n - i*i, dp);

            min = Math.min(min, count);
        }

        return dp[n] = min;
    }

    public int numSquares(int n) {

        int[] dp = new int[n + 1];

        return solve(n, dp);
    }
}