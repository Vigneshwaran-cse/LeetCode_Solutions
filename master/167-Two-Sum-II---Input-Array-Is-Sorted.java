class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;int right=numbers.length-1;int current_Sum=0;
        while(left<right)
        {
            current_Sum=numbers[left]+numbers[right];
            if(current_Sum==target)
            {
                return new int[]{left+1,right+1};
            }
            else if(current_Sum<target)
            {
                left+=1;
            }
            else{
                right-=1;
            }
        }
        return null;
        
    }
}