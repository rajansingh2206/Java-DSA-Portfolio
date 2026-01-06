class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int n=height.length;
        int right=n-1;
        int maxArea=0;
        while(left<right){
            if(height[left]<height[right]){
                int currArea=height[left]*(right-left);
                maxArea=Math.max(currArea,maxArea);
                left++;
            }
            else{
                int currArea=height[right]*(right-left);
                maxArea=Math.max(currArea,maxArea);
                right--;
            }
        }
        return maxArea;
    }
}