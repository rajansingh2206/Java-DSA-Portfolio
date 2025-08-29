class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        
        return recursion(nums,target,0,0);
    }
    public int recursion(int []nums,int target,int idx,int currSum)
    {
        if(idx==nums.length)
            return currSum==target?1:0;

        //take +ve
        int ans1=recursion(nums,target,idx+1,currSum+nums[idx]);

        //take -ve
        int ans2=recursion(nums,target,idx+1,currSum-nums[idx]);

        return ans1+ans2;
    }
}