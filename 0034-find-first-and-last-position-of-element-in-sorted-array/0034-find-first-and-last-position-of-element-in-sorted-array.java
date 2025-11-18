class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[] ans=new int[]{-1,-1};
        ans[0]=binarySearch(n,nums,target,"left");
        ans[1]=binarySearch(n,nums,target,"right");
        return ans;
    }
    private int binarySearch(int n, int[] nums, int target,String type){
        int low=0;
        int high=n-1;
        int res=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                res=mid;
                if(type=="left")
                    high=mid-1;
                else
                    low=mid+1;
            }
            else if(nums[mid]<target)
                low=mid+1;
            else
                high=mid-1;
        }
        return res;
    }
}