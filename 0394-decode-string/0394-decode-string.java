class Solution {
    public String decodeString(String s) {
        int n=s.length();
        Stack<Integer> countStack=new Stack<>();
        Stack<StringBuffer> stringStack=new Stack<>();
        int num=0;
        StringBuffer curr=new StringBuffer();
        StringBuffer ans=new StringBuffer();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }
            else if(ch=='['){
                countStack.push(num);
                stringStack.push(curr);
                num=0;
                curr=new StringBuffer();
            }
            else if(ch==']'){
                int count=countStack.pop();
                StringBuffer prev=stringStack.pop();
                StringBuffer expanded=new StringBuffer(prev);
                for(int i=0;i<count;i++){
                    expanded.append(curr);
                }
                curr=expanded;
            }
            else
                curr.append(ch);
        }
        return curr.toString();
    }
}