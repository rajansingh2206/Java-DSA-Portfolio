class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count=new int[256]; 
        int n=s.length();
        if(n<=1)
            return n==1?1:0;
        int left=0;
        count[s.charAt(0)]=1;
        int right=1;
        int max_len=0;
        while(right<n){
            while(count[s.charAt(right)]!=0){
                count[s.charAt(left)]--;
                left++;
            }

            count[s.charAt(right)]++;
            max_len=Math.max(max_len,right-left+1);
            right++;
        }
        return max_len;
    }
}