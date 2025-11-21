class Solution {
    public int romanToInt(String s) {
        int n=s.length();
        int map[]=new int[128];
        map['I']=1;
        map['V']=5;
        map['X']=10;
        map['L']=50;
        map['C']=100;
        map['D']=500;
        map['M']=1000;
        int total=0;
        for(int i=0;i<n;i++){
            int curr=map[s.charAt(i)];
            int next= (i==n-1)?0:map[s.charAt(i+1)];
            if(curr<next)
                total-=curr;
            else
                total+=curr;
        }
        return total;
    }
}