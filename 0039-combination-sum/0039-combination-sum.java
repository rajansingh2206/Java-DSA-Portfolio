class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int n=candidates.length;
        List<Integer> combi=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        helper(candidates,target,0,combi,ans);
        return ans;
    }
    private void helper(int []arr,int tar,int idx,List<Integer> combi,List<List<Integer>> ans)
    {
        if(tar<0 || idx>=arr.length)
            return;
        if(tar==0)
        {
            ans.add(new ArrayList<>(combi));
            return;
        }
        combi.add(arr[idx]);
        helper(arr,tar-arr[idx],idx,combi,ans);
        combi.remove(combi.size()-1);
        helper(arr,tar,idx+1,combi,ans);
    }
}