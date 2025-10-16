class Solution {
    public double myPow(double x, int n) {

        long m=n;
        if(n<0)
            m=-m;
        double ans=1.0;
        double base=x;
        while(m>0)
        {
            if(m%2==1)
            {
                ans*=base;
                m-=1;
            }
            else
            {
                base*=base;
                m=m/2;
            }
        }
        return n<0?1/ans:ans;

        // double ans=1;
        // for(int i=0;i<m;i++)
        //     ans*=x;
        // System.out.println(ans);

    }
}