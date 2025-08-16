class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<Integer> combinations = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backtracking(nums, 0, combinations, ans);
        return ans;
    }

    private void backtracking(int[] nums, int idx, List<Integer> combinations, List<List<Integer>> ans) {
        if (idx >= nums.length) {
            ans.add(new ArrayList<>(combinations));
            return;
        }
        combinations.add(nums[idx]);
        backtracking(nums, idx + 1, combinations, ans);
        combinations.remove(combinations.size() - 1);
        int nextElement = idx + 1;
        while (nextElement < nums.length && nums[nextElement] == nums[nextElement - 1])
            nextElement++;
        backtracking(nums, nextElement, combinations, ans);
    }
}