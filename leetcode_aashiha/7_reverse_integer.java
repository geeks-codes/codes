class Solution 
{
    public long reverseNum(int x)
    {
        long reverse = 0;
        while(x > 0)
        {
            long s = x % 10;
            reverse = (reverse * 10) + s;
            x = x / 10;
        }
        return reverse;
    }
    public int reverse(int x) 
    {
        boolean isNegative = false;
        if(x<0)
        {
            isNegative = true;
        }
        x = Math.abs(x);
        long y = reverseNum(x);
        if(isNegative)
        {
            y = y * (-1);      
        }
        //overflow checking
        if(y < Integer.MIN_VALUE || y > Integer.MAX_VALUE)
        {
            return 0;
        }
        return (int)y;
    }
}
