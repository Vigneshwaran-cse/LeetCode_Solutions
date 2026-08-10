class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int largest=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0 ){
                if(count>largest)
                {
                    largest=count;
                    count=0;
                    continue;
                }
                
            }
            else if(nums[i]==1)
            {
                count++;
                if(i==nums.length-1)
                {
                    if(count>largest)
                {
                    largest=count;
                    count=0;
                }
                }
            }
        }
        return largest;
    }
}