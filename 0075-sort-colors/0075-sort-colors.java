class Solution {
    public void sortColors(int[] nums) {
       
        int n=nums.length;

        int low=0,mid=0,high=n-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
                swap(nums,low++,mid++);
            else if(nums[mid]==1)
                mid++;
            else
                swap(nums,high--,mid);
        }
        // int zeroes=0;
        // int ones=0;
        // int twos=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]==0)
        //         zeroes++;
        //     else if(nums[i]==1)
        //         ones++;
        //     else 
        //         twos++;
        // }
        // int idx=0;
        // for(int i=0;i<zeroes;i++)
        //     nums[idx++]=0;
        // for(int i=0;i<ones;i++)
        //     nums[idx++]=1;
        // for(int i=0;i<twos;i++)
        //     nums[idx++]=2;
    }
    private void swap(int [] nums, int num1,int num2)
    {
        int temp=nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;
    }
}