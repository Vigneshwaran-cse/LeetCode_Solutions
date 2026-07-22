class Solution {
    public int addDigits(int num) {
        int digit=0;int sum=0;
        if(num<10)
        {
            return num;
        }
        while(num>9)
        {
            sum=0;
            while(num!=0)
            {
              digit=num%10;
              sum=sum+digit;
              num/=10; 
            }
            num=sum;
        }
        return sum;
        
    }
}