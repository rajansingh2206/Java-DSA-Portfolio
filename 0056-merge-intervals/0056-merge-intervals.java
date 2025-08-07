class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<n;i++)
        {
            if(ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1)[1])
                ans.add(intervals[i]);
            else
                ans.get(ans.size()-1)[1]=Math.max(intervals[i][1],ans.get(ans.size()-1)[1]);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}