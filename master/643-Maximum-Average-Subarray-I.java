class Solution {
    static {
        for(int i=0;i<100;i++){
            findMaxAverage(new int[1],1);
        }
    }
    public static double findMaxAverage(int[] nums, int k) {
      int sum=0;
      for(int i=0;i<k;i++){
        sum+=nums[i];
      }
      int maxsum=sum;

      for(int i=k;i<nums.length;i++){
        sum+=nums[i]-nums[i-k];
        maxsum=Math.max(maxsum,sum);
      }
    
    return (double)maxsum/k;
    }
}