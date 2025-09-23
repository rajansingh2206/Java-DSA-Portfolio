class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten=0,five=0;
        for(int i=0;i<bills.length;i++)
        {
            if(bills[i]==5)
                five++;
            else if(bills[i]==10)
            {
                if(five<=0)
                    return false;
                five--;
                ten++;
            }
            else
            {
                if(ten<=0)
                {
                    if(five<=2)
                        return false;
                    else
                        five-=3;
                }
                else
                {
                    if(five<=0)
                        return false;
                    else
                    {
                        five--;
                        ten--;
                    }
                }

            }
        }
        return true;
    }
}