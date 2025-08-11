class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        int []rightSmaller=new int[n];
        int []leftSmaller=new int[n];
        Stack<Integer> s=new Stack<>();
        for (int i = 0; i < n; i++) 
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[i])
                s.pop();
            leftSmaller[i]=s.isEmpty() ? -1 : s.peek();
            s.push(i);
        }
        while(!s.isEmpty())
            s.pop();
        for(int j=n-1;j>=0;j--)
        {
            while(!s.isEmpty() && heights[s.peek()]>=heights[j])
                s.pop();
            rightSmaller[j]=s.isEmpty() ? n : s.peek();
            s.push(j);
        }
        for(int i=0;i<n;i++)
        {
            int currArea=heights[i]*(rightSmaller[i]-leftSmaller[i]-1);
            maxArea=Math.max(currArea,maxArea);
        }
        return maxArea;
        
    }
}