class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int n=s.length();
        if(n<=1)
            return true;
        int start=0;
        int end=n-1;
        while(start<=end){

            while(start<=end && !Character.isLetterOrDigit(s.charAt(start)))
                start++;

            while(end>=start && !Character.isLetterOrDigit(s.charAt(end)))
                end--;

            if(start>end)
                return true;

            if(s.charAt(start)!=s.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}