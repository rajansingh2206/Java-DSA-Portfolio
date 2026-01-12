class Solution {
    public String longestPalindrome(String s) {
        
        String max="";
        int n=s.length();
        if(n<=1)
            return s;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String newString=s.substring(i,j+1);
                if(isPalindrome(newString))
                {
                    if(newString.length()>max.length())
                        max=newString;
                }
            }
        }
        return max;
    }
    private boolean isPalindrome(String s){
        int n=s.length();
        int start=0;
        int end=n-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end))
                return false;
            start++;
            end--;
        }
        return true;
    }
}