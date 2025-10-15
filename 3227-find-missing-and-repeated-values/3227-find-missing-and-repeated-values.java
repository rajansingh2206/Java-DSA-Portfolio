class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        
        int ans[]=new int[2];
        int a=0;
        int b=0;
        // Set<Integer> set=new HashSet<>();
        // int expSum=0,actSum=0;
        int n=grid.length;

        // for(int i=0;i<n;i++)
        // {
        //     for(int j=0;j<n;j++)
        //     {
        //         actSum+=grid[i][j];
        //         boolean check=set.add(grid[i][j]);
        //         if(check==false)
        //             a=grid[i][j];
        //     }
        // }
        // expSum=((n*n)*((n*n)+1))/2;
        // System.out.println(a+" "+actSum+" "+expSum);
        // b=expSum+a-actSum;

        // ans[0]=a;
        // ans[1]=b;
        // return ans;

        int count[]=new int[(n*n)+1];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                count[grid[i][j]]++;
            }
        }
        for(int i=1;i<=n*n;i++)
        {
            if(count[i]==2)
                a=i;
            else if(count[i]==0)
                b=i;
        }
        return new int[]{a,b};
    }
}