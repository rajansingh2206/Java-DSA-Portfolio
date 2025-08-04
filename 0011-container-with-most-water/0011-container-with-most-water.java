class Solution {
    public int maxArea(int[] height) {
      int maxArea=Integer.MIN_VALUE;
      int wdth=0;
      int ht=0;
      int n=height.length;
      int lp=0,rp=n-1;
      while(lp<rp)
      {
        int currArea=0;
        wdth=rp-lp;
        ht=Math.min(height[lp],height[rp]);
        currArea=ht*wdth;
        maxArea=Math.max(currArea,maxArea);
        if(height[lp]<height[rp]) lp++; else rp--;
      }

    //Brute Force - O(n^2)
    //   for(int i=0;i<n;i++)
    //   {
    //     int currArea=0;
    //      for(int j=i+1;j<n;j++)
    //      {
    //         wdth=j-i;
    //         ht=Math.min(height[i],height[j]);
    //         currArea=wdth*ht;
    //         // System.out.println("Height: "+ht+" Width: "+wdth+" currArea:"+currArea);
    //         maxArea=Math.max(currArea,maxArea);
    //      }
    //   }
      return maxArea;
    }
}