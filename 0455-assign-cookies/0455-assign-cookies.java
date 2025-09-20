class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int count=0;
        int i=0,j=0;

        while(i<g.length)
        {
            while(j<s.length && i<g.length)
            {
                if(s[j]>=g[i])
                {
                    count++;
                    i++;
                    j++;
                }
                else
                    j++;
            }
            i++;
        }
        return count;
    }
}