class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n=nums.length;
        int temp[]=new int[n];
        int idx=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0)
                temp[idx++]=nums[i];
        }
        int negative_point=idx;
        for(int i=0;i<n;i++){
            if(nums[i]<0)
                temp[idx++]=nums[i];
        }
        int temp2[]=new int[n];
        int positive_point=0;
        int i=0;
        while(i<n){
            temp2[i++]=temp[positive_point++];
            temp2[i++]=temp[negative_point++];
        }
        return temp2;

    }
}