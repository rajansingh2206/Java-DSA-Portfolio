class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb=new StringBuffer();
        for(char c: s.toLowerCase().toCharArray())
        {
            if(Character.isLetterOrDigit(c))
                sb.append(c);
        }
        String filtered = sb.toString(); 
        String reversed = sb.reverse().toString(); 
        return filtered.equals(reversed);
    }
}