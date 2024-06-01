//
 min=first element ( assume to buy on first day ) intially we make 0 profit there will no negative profits 
 cost=you sell at ith day element and subtract it from min that you buy 
 update the profit on max(profit , cost)
 update the min on min(min , the day you buy)
 finally return profit


   *** TIME COMPLEXITY=O(n)
       SPACE COMPLEXITY=O(1) ***
       
//

class maxProfit {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int cost=prices[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,prices[i]);
        }
        return profit;
    }
}