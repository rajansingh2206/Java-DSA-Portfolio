class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int prefix=1;
        int suffix=1;
        Arrays.fill(ans,1);
        for(int i=1;i<n;i++)
        {
            prefix=prefix*nums[i-1];
            ans[i]=prefix;
        }
        for(int i=n-2;i>=0;i--)
        {
            suffix=suffix*nums[i+1];
            ans[i]=ans[i]*suffix;
        }
        return ans;
    }
}