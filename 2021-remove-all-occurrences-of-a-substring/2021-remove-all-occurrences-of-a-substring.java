class Solution {
    public String removeOccurrences(String s, String part) {

        // while(s.contains(part))
        //     s=s.replaceFirst(part,"");
        // return s;

        StringBuffer sb=new StringBuffer(s);
        int partLen=part.length();
        while(true)
        {
            int idx=find(sb,part);
            if(idx==-1) break;
            sb.delete(idx,idx+partLen);
        }
        return sb.toString();
    }
    private int find(StringBuffer sb,String part)
    {
        int n=sb.length(),m=part.length();

        for(int i=0;i<=n-m;i++)
        {
            boolean match=true;
            for(int j=0;j<m;j++)
            {
                if(sb.charAt(i+j)!=part.charAt(j))
                {
                    match=false;
                    break;
                }
            }
            if(match) return i;
        }
        return -1;
    }
  
}