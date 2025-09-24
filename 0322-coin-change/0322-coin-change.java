class Solution {
    public int coinChange(int[] coins, int amount) {

        int dp[] = new int[amount + 1];
        Arrays.fill(dp, -100);
        return helper(coins, amount, dp);
    }

    private int helper(int[] coins, int amount, int dp[]) {
        if (amount == 0)
            return 0;
        if (amount < 0)
            return -1;
        if (dp[amount] != -100)
            return dp[amount];
        int minCoins = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = helper(coins, amount - coin, dp);
            if (res >= 0 && res < minCoins) {
                minCoins = res + 1;
            }
        }
        dp[amount] = minCoins == Integer.MAX_VALUE ? -1 : minCoins;
        return dp[amount];
    }
}