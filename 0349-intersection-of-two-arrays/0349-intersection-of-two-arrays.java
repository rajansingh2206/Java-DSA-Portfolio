class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int num: nums1)
            set.add(num);

        for(int num:nums2){
            if(set.contains(num)){
                set2.add(num);
            }
        }
         return set2.stream().mapToInt(Integer::intValue).toArray();
    }
}