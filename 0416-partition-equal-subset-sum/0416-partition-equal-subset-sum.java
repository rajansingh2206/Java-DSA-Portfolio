class Solution {
    public boolean canPartition(int[] nums) {
        int totalSum=0;
        for(int val:nums)
            totalSum+=val;

        if(totalSum%2!=0)   return false;
        int requiredSum=totalSum/2;
        Boolean dp[][]=new Boolean[nums.length+1][requiredSum+1];
        boolean ans=recursion(nums,requiredSum,0,dp);
        return ans;
    }   
    private boolean recursion(int[] nums,int requiredSum,int i,Boolean dp[][])
    {
        if(requiredSum==0)
            return true;

        if(i==nums.length && requiredSum!=0)
            return false;

        if(dp[i][requiredSum]!=null)
            return dp[i][requiredSum];
    
        if(nums[i]<=requiredSum)
        {
            dp[i][requiredSum]=recursion(nums,requiredSum-nums[i],i+1,dp) || recursion(nums,requiredSum,i+1,dp);
            return dp[i][requiredSum];
        }
        else
        {
            dp[i][requiredSum]=recursion(nums,requiredSum,i+1,dp);
             return dp[i][requiredSum];
        }
    
    } 
}