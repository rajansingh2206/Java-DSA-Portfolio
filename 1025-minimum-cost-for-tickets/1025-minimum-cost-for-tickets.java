class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        Integer dp[]=new Integer[days.length+1];
        return recursion(days,costs,0,dp);
    }
    public int recursion(int[] days,int[] cost,int idx,Integer dp[])
    {
        if(idx>=days.length) return 0;

        if(dp[idx]!=null)
            return dp[idx];
        //add 1 day
        int ans1=cost[0]+recursion(days,cost,idx+1,dp);

        //add 7 days
        int j=idx;
        while(j<days.length && days[j]<days[idx]+7) j++;
        int ans2=cost[1]+recursion(days,cost,j,dp);

        //add 30 days
        int k=idx;
        while(k<days.length && days[k]<days[idx]+30) k++;
        int ans3=cost[2]+recursion(days,cost,k,dp);

        dp[idx]=Math.min(ans1,Math.min(ans2,ans3));
        return dp[idx];
    }
}