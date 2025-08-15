class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int n=candidates.length;
        Arrays.sort(candidates);
        List<Integer> combi=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        helper(candidates,target,0,combi,res);
        return res;
    }
    private void helper(int[] arr, int tar,int idx,List<Integer> combi,List<List<Integer>> res)
    {
        if(tar==0)
        {
            res.add(new ArrayList<>(combi));
            return;
        }   
        for(int i=idx;i<arr.length;i++)
        {
            if(i>idx && arr[i]==arr[i-1]) continue;
            if(tar<0) break;
            combi.add(arr[i]);
            helper(arr,tar-arr[i],i+1,combi,res);
            combi.remove(combi.size()-1);
        }
        
    }
}