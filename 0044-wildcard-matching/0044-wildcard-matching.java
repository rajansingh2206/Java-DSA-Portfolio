class Solution {
    public boolean isMatch(String s, String p) {
        int n=s.length(),m=p.length();

        boolean dp[][]=new boolean[n+1][m+1];

        //initialize

        // if string is empty and pattern is emoty then it is match
        dp[0][0]=true;

        // if string contains any chars but pattern is empty, we can't match anything

        for(int i=1;i<=n;i++)
            dp[i][0]=false;

        // if string is empty then there are n patterns
        for(int j=1;j<=m;j++)
        {
            if(p.charAt(j-1)=='*')
                dp[0][j]=dp[0][j-1];
            else
                dp[0][j]=false;
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(p.charAt(j-1)==s.charAt(i-1) || p.charAt(j-1)=='?')
                    dp[i][j]=dp[i-1][j-1];
                else if(p.charAt(j-1)=='*')
                    dp[i][j]=dp[i][j-1] || dp[i-1][j];
                else
                    dp[i][j]=false;
            }
        }

        return dp[n][m];

    }
}