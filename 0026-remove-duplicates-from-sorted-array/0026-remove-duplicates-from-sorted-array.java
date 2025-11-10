class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;

        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int size=set.size();
        int j=0;
        for(int val:set){
            nums[j++]=val;
        }
        return size;
    }
}