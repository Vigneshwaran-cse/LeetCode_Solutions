class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        List<Boolean> Lst = new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]>=max)
            {
                max=candies[i];
            }
        }
        for(int p=0;p<candies.length;p++)
        {
            if(candies[p]+extraCandies>=max)
            {
                Lst.add(true);
            }
            else
               Lst.add(false);
        }
        return Lst;
    }
}