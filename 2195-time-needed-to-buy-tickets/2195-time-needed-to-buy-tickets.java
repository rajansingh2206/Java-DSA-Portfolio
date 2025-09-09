class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        
        int n=tickets.length;
        int total_time=0;
        for(int i=0;i<n;i++)
        {
            if(i<=k)
                total_time+=Math.min(tickets[i],tickets[k]);
            else
                total_time+=Math.min(tickets[i],tickets[k]-1);
        }
        return total_time;
    }
}