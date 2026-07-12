class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split("\\s+");
        for(String text:arr){
            sb.append(new StringBuilder(text).reverse()+" ");
        }
        return sb.reverse().toString().trim();
    }
    
}