class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean[] count=new boolean[n+1];
        for(int i=0;i<n;i++){
            count[nums[i]]=true;
        }
        for(int i=0;i<=n;i++){
            if(count[i]==false)
                return i;
        }
        return -1;
    }
}