class Solution {
    public int maxScore(int[] cardPoints, int k) {
        
        int totalSum=0;
        int windowSum=0;
        int n=cardPoints.length;

        for(int num:cardPoints){
            totalSum+=num;
        }

        int windowSize=n-k;
        for(int i=0;i<windowSize;i++){
            windowSum+=cardPoints[i];
        }
        int minWindowSum=windowSum;

        for(int right=windowSize;right<n;right++){
            windowSum+=cardPoints[right];
            windowSum-=cardPoints[right-windowSize];
            minWindowSum=Math.min(minWindowSum,windowSum);
        }
        return totalSum-minWindowSum;
    }
}