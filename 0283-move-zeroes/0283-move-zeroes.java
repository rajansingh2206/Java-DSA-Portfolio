class Solution {
    public void moveZeroes(int[] nums) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            map.put(i,nums[i]);
        }
        int count=0;
        int idx=0;
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()==0)
                count++;
            else
            {
                nums[idx]=m.getValue();
                idx++;
            }
        }
        int lastIdx=n-1;
        while(count!=0){
            nums[lastIdx]=0;
            lastIdx--;
            count--;
        }
    }
}