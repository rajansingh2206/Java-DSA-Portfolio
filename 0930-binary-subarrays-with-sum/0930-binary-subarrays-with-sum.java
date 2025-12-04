class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            int currSum=0;
            int start=i;
            int end=i;
            while(end<n && currSum<=goal){
                currSum+=nums[end];
                if(currSum==goal){
                    count++;
                }
                end++;
            }
        }
        return count;
    }
}