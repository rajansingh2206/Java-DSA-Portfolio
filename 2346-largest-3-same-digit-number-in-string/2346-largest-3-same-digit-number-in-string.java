class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        String ans="";
        for(int i=0;i<=n-3;i++)
        {
            char c=num.charAt(i);
            if(c==num.charAt(i+1)&&c==num.charAt(i+2))
            {
                String good=num.substring(i,i+3);
                if(good.compareTo(ans)>0)
                    ans=good;
            }
            
        }
        return ans;
    }
}