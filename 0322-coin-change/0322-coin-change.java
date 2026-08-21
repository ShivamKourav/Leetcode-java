class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount + 1];

        for (int i = 1; i <= amount; i++) {
            dp[i] = amount + 1;
        }

        for (int i = 1; i <= amount; i++) {

            for (int j = 0; j < coins.length; j++) {

                int coin = coins[j];

                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        if (dp[amount] == amount + 1) {
            return -1;
        }

        return dp[amount];
    }
}