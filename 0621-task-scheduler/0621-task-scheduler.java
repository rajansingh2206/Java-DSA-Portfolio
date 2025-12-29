class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(char c:tasks){
            freq[c-'A']++;
        }
        int maxFreq=0;
        int maxCount=0;
        for(int f:freq){
            if(f>maxFreq){
                maxFreq=f;
                maxCount=1;
            }
            else if(f==maxFreq){
                maxCount++;
            }
        }
        int ans=(maxFreq-1)*(n+1)+maxCount;
        return Math.max(ans,tasks.length);
    }
}