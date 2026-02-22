class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder s1=new StringBuilder();
        StringBuilder t1=new StringBuilder();
        int n=s.length();
        int m=t.length();

        for(int i=0;i<n;i++){
            int n1=s1.length();
            if(s.charAt(i)=='#')
            {
                if(n1>0)
                    s1.deleteCharAt(n1-1);
            }
            else
                s1.append(s.charAt(i));
        }
        for(int i=0;i<m;i++){
            int m1=t1.length();
            if(t.charAt(i)=='#')
            {
                if(m1>0)
                    t1.deleteCharAt(m1-1);
            }
            else
                t1.append(t.charAt(i));
        }
        System.out.println(s1+" "+t1);
        return s1.toString().equals(t1.toString());
    }
}