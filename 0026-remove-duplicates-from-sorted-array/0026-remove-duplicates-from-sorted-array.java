class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int idx=1;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[j-1])
                nums[idx++]=nums[j];
        }
        return idx;
    }
}