class Solution {
    public int lengthOfLongestSubstring(String s) {
        int idx[]=new int[256];
        Arrays.fill(idx,-1);
        int left=0;
        int right=0;
        int maxLen=0;
        int n=s.length();
        while(right<n)
        {
            char currentChar=s.charAt(right);
            if(idx[currentChar]>=left && idx[currentChar]!=-1)
            {
                left=idx[currentChar]+1;
            }
            idx[currentChar]=right;
            int currLen=right-left+1;
            maxLen=Math.max(maxLen,currLen);
            right++;
        }
        return maxLen;
    }
}