class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int val:nums)
        {
            map.put(val,map.getOrDefault(val,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()==1)
                return entry.getKey();
        }
        return -1;
    }
}