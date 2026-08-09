class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        double Price=0;
        Arrays.sort(prices);
        Arrays.sort(discounts);

        int pIndex=prices.length-1;
        int dIndex=discounts.length-1;
        while(pIndex>=0)
            {
                 if(dIndex>=0){
                          Price=Price+(prices[pIndex]*(100-discounts[dIndex])/100.0);
                          dIndex--;
                      }
                      else{
                          Price=Price+prices[pIndex];
                          
                      }
                pIndex--;
            }
              
        return Price;
        
    }
}