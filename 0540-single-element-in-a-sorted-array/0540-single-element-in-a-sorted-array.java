class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums)
        {
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int val:nums)
        {
            if(map.getOrDefault(val,0)==1)
                return val;
        }
        return -1;
    }
}