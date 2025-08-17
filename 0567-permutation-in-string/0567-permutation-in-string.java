class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char c1[]=s1.toCharArray();
        Arrays.sort(c1);
        int n=s1.length(),m=s2.length();
        for(int j=0;j<=m-n;j++)
        {
            String sub=s2.substring(j,j+n);
            char subc2[]=sub.toCharArray();
            Arrays.sort(subc2);
            if(Arrays.equals(c1,subc2))
                return true;
        }
        return false;
    }
}