class Solution {
    public String minWindow(String s, String t) {
        int left=0,right=0;
        int m=t.length();
        int minLen=Integer.MAX_VALUE, startIndex=-1;
        int hash[]=new int[256];
        int count=0;

        for(char c:t.toCharArray())
            hash[c]++;

        while(right<s.length())
        {
            char c=s.charAt(right);
            if(hash[c]>0)
                count++;
            
            hash[c]--;
            while(count == m)
            {
                if(right-left+1<minLen)
                {
                    minLen=right-left+1;
                    startIndex=left;
                }
                char leftch=s.charAt(left);
                hash[leftch]++;
                if(hash[leftch]>0)  count--;
                left++;
            }
            right++;
        }
        return startIndex==-1?"":s.substring(startIndex,startIndex+minLen);
    }
}