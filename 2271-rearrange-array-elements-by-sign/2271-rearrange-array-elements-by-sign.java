class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int n=nums.length;
        int pos=0;
        int neg=1;
        int res[]=new int[n];
        for(int val:nums){
            if(val>0)
            {
                res[pos]=val;
                pos+=2;
            }
            else
            {
                res[neg]=val;
                neg+=2;
            }
        }
        return res;
    }
}