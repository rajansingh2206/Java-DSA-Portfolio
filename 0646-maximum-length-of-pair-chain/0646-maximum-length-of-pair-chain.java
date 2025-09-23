class Solution {
    public int findLongestChain(int[][] pairs) {
        
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainLen=1;
        int lastEndTime=pairs[0][1];
        // System.out.println(pairs[0][0]+" "+pairs[0][1]);
        for(int i=1;i<pairs.length;i++)
        {
        //     System.out.println(pairs[i][0]+" "+pairs[i][1]);
            if(pairs[i][0]>lastEndTime)
            {
                chainLen++;
                lastEndTime=pairs[i][1];
            }
        }
        return chainLen;
    }
}