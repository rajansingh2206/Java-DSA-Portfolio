class Solution {
    public int myAtoi(String s) {
        int n=s.length(), sign_bit=1, res=0 , idx=0;

        while(idx<n && s.charAt(idx)==' ')
            idx++;

        if(idx<n && ( s.charAt(idx)=='-' || s.charAt(idx)=='+' ) )
        {
            if(  s.charAt(idx)=='-')
                sign_bit=-1;
            idx++;
        }

        while(idx<n && Character.isDigit(s.charAt(idx))){
            int digit=s.charAt(idx)-'0';

            if( res > (Integer.MAX_VALUE - digit)/10 )
            {
                return sign_bit==-1?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            res=res*10+digit;
            idx++;
        }
        return res*sign_bit;
    }
}