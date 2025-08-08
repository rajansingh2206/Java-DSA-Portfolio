class Solution {
    public int trap(int[] height) {

     int n=height.length;
     int leftMax=0, rightMax=0;
     int left=0,right=n-1;
     int sum=0;
     while(left<right)
     {
        leftMax=Math.max(leftMax,height[left]);
        rightMax=Math.max(rightMax,height[right]);
        if(leftMax<rightMax)
        {
            sum+=leftMax-height[left];
            left++;
        }
        else
        {
            sum+=rightMax-height[right];
            right--;
        }
     }
    //  int leftMax[]=new int[n];
    //  int rightMax[]=new int[n];
    //  leftMax[0]=height[0];
    //  int sum=0;
    //  rightMax[n-1]=height[n-1];
    //  for(int i=1;i<n;i++)
    //     leftMax[i]=Math.max(leftMax[i-1],height[i]);
     
    //  for(int i=n-2;i>=0;i--)
    //     rightMax[i]=Math.max(rightMax[i+1],height[i]);
     
    //  for(int i=0;i<n;i++)
    //     sum+=Math.min(leftMax[i],rightMax[i])-height[i];

        return sum;
    }
}