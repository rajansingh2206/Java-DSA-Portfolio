class Solution {
    public boolean isValid(String str) {
        Stack<Character> s=new Stack<>();
        if(str.length()<2)
            return false;
        for(char c:str.toCharArray()){
            if(c=='(' || c=='{' || c=='[')
                s.push(c);
            else if( (!s.isEmpty()) && ( (s.peek()=='{' && c=='}') || (s.peek()=='[' && c==']') || (s.peek()=='(' && c==')')))
                s.pop();
            else
                return false;
        }
        return s.isEmpty();
    }
}