class Solution {
    public int climbStairs(int n) {
        
        // int dp[]=new int[n+1];

        //recursion
        // return countWays(n,dp);

        //tabulation
        // dp[0]=1;
        // for(int i=1;i<=n;i++)
        // {
        //     if(i==1)
        //         dp[i]=dp[i-1];
        //     else
        //         dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];

        //space-opt dp
        if(n<=2)  return n;
        int a=1,b=2;
        for(int i=3;i<=n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
        }
        return b;

    }
    public int countWays(int n,int dp[])
    {
        if(n==0)
            return 1;

        if(n<0)
            return 0;

        if(dp[n]!=0)
            return dp[n];

        dp[n]=countWays(n-1,dp)+countWays(n-2,dp);
        
        return dp[n];
    }


}