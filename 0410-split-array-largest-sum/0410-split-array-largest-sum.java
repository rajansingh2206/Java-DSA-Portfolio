class Solution {
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int sum=0,ans=-1;
        for(int val:nums)
            sum+=val;
        int start=0,end=sum;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(isValid(nums,n,k,mid))
            {
                end=mid-1;
                ans=mid;
            }
            else
                start=mid+1;
        }
        return ans;
    }
    private boolean isValid(int []arr,int n,int k,int maxSum)
    {
        int count_array=1;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>maxSum)  return false;
            if(sum+arr[i]<=maxSum)
                sum+=arr[i];
            else
            {
                count_array++;
                sum=arr[i];
            }
        }
        return count_array<=k;
    }
}