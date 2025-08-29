class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum=0;
        for(int val:nums)
            totalSum+=val;
        Integer dp[][]=new Integer[nums.length+1][2*totalSum+1];
        return recursion(nums,target,0,0,dp,totalSum);
    }
    public int recursion(int []nums,int target,int idx,int currSum,Integer dp[][],int totalSum)
    {
        if(idx==nums.length)
            return currSum==target?1:0;

        int offsetSum=currSum+totalSum;
        if(dp[idx][offsetSum]!=null)
            return dp[idx][offsetSum];

        //take +ve
        int ans1=recursion(nums,target,idx+1,currSum+nums[idx],dp,totalSum);

        //take -ve
        int ans2=recursion(nums,target,idx+1,currSum-nums[idx],dp,totalSum);

        dp[idx][offsetSum]=ans1+ans2;
        return dp[idx][offsetSum];
    }
}