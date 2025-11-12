class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int final_count=0;
        int ones_count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0)
                ones_count=0;
            else
            {
                ones_count=ones_count+1;
                final_count=Math.max(final_count,ones_count);
            }
        }
        return final_count;
    }
}