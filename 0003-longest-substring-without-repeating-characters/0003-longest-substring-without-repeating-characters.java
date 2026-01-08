class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        if(n<=1)
            return n==1?1:0;
        int left=0;
        int char_present[]=new int[256];
        char_present[s.charAt(left)]=1;
        int right=1;
        int max_len=0;
        while(right<n){
            while(char_present[s.charAt(right)]!=0){
                char_present[s.charAt(left)]--;
                left++;
            }
            char_present[s.charAt(right)]++;
            max_len=Math.max(max_len,right-left+1);
            right++;
        }
        return max_len;
    }
}