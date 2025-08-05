class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLen = 0;
        int n = s.length();

        // Map<Character,Integer> map = new LinkedHashMap<>();
        // int lp = 0, rp = 0;
        // while (rp < n) {
        //     char curr = s.charAt(rp);
        //     if (map.containsKey(curr) && map.get(curr)>=lp)
        //         lp = map.get(curr) + 1;
        //     map.put(curr,rp);
        //     int currLen = rp - lp + 1;
        //     maxLen = Math.max(maxLen, currLen);
        //     rp++;
        // }
        int hash[]=new int[256];
        Arrays.fill(hash,-1);
        int lp=0,rp=0;
        while(rp<n)
        {
            int curr=s.charAt(rp);
            if(hash[curr]!=-1 && hash[curr]>=lp)
                lp=hash[curr]+1;
            hash[curr]=rp;
            int currLen=rp-lp+1;
            maxLen=Math.max(maxLen,currLen);
            rp++;
        }
        // Set<Character> set=new LinkedHashSet<>();
        // for(int i=0;i<n;i++)
        // {
        //     int currLen=1;
        //     set=new LinkedHashSet<>();
        //     set.add(s.charAt(i));
        //     for(int j=i+1;j<n;j++)
        //     {
        //         maxLen=Math.max(currLen,maxLen);
        //         if(set.add(s.charAt(j))==false)
        //         {
        //             break;
        //         }
        //         else
        //         {
        //             currLen++;
        //         }
        //     }
        // }
        return maxLen;
    }
}