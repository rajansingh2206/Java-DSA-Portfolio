class Solution {
    public int compress(char[] chars) {
       
       int idx=0;
       int n=chars.length;
       for(int i=0;i<n;)
       {
            char c=chars[i];
            int count=0;

            while(i<n && chars[i]==c)
            {
                i++;
                count++;
            }
            chars[idx++]=c;
            if(count>1)
            {
                String strCount=String.valueOf(count);
                for(char char_count:strCount.toCharArray())
                {
                    chars[idx++]=char_count;
                }
            }
       }
       return idx;
    }
}