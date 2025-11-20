class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        for(int i=n-1;i>=0;i--){
            int number=Character.getNumericValue(num.charAt(i));
            if(number%2==1)
                return num.substring(0,i+1);
        }
        return "";
    }
}