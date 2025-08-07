class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans=new ArrayList<>();
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        for(int i=0;i<n;i++)
        {
            int start=intervals[i][0];
            int end=intervals[i][1];
            if(!ans.isEmpty() && intervals[i][0]<=ans.get(ans.size()-1)[1])
                continue;
            else
            {
                for(int j=i+1;j<n;j++)
                {
                    if(intervals[j][0]<=end)
                        end=Math.max(intervals[j][1],end);
                    else
                        break;
                }
                ans.add(new int[]{start,end});
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}