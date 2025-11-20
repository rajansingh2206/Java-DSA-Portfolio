class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        int idx=-1;
        for(int i=n-1;i>=0;i--){
            int number=Character.getNumericValue(num.charAt(i));
            System.out.println(number +" "+number%2);
            if(number%2==1)
            {
                idx=i+1;
                break;
            }
        }
        return idx==-1?"":num.substring(0,idx);
    }
}