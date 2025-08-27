class Solution {
    public int minCostClimbingStairs(int[] cost) {

        int n=cost.length;
        if(n==2)
            return Math.min(cost[0],cost[1]);

        for(int i=2;i<n;i++)
            cost[i]=cost[i]+Math.min(cost[i-1],cost[i-2]);

        return Math.min(cost[n-1],cost[n-2]);
        // int dp[]=new int[cost.length+1];
        // Arrays.fill(dp,-1);
        // return Math.min(countCost(0,cost,dp),countCost(1,cost,dp));
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