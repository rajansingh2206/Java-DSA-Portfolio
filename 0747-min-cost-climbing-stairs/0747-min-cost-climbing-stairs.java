class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int dp[]=new int[cost.length+1];
        Arrays.fill(dp,-1);
        return Math.min(countCost(0,cost,dp),countCost(1,cost,dp));
    }
    public int countCost(int idx,int cost[],int dp[])
    {
        if(idx>=cost.length)
            return 0;

        if(dp[idx]!=-1)
            return dp[idx];

        int a=cost[idx]+countCost(idx+1,cost,dp);
        int b=cost[idx]+countCost(idx+2,cost,dp);

        dp[idx]=Math.min(a,b);
        return dp[idx];
    }

}