class Solution {
    public int maxProfit(int[] prices) {

        int maxProfit=0,bestBuy=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>bestBuy)
                maxProfit=Math.max(maxProfit,prices[i]-bestBuy);
            bestBuy=Math.min(prices[i],bestBuy);
        }
        return maxProfit;
        // int currProf=0,maxProf=0;
        // int n=prices.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         currProf=prices[j]-prices[i];
        //         maxProf=Math.max(maxProf,currProf);
        //     }
        // }
        // return maxProf;
    }
}