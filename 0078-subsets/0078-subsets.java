class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<Integer> combinations=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        backtracking(nums,0,combinations,ans);
        return ans;
    }
    private void backtracking(int[] nums,int idx,List<Integer> combinations,List<List<Integer>> ans)
    {
        if(idx>=nums.length)
        {
            ans.add(new ArrayList<>(combinations));
            return;
        }
        combinations.add(nums[idx]);
        backtracking(nums,idx+1,combinations,ans);
        combinations.remove(combinations.size()-1);
        backtracking(nums,idx+1,combinations,ans);
    }
}