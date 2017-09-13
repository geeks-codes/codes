class Solution 
{
    public int myAtoi(String str) 
    {
        str = str.trim();
        char[] arr = str.toCharArray();
        
        long sum = 0, count=0, a;
        boolean isnegative = false;
        if(str.length() == 0)
        {
            return 0;
        }
        if((int)arr[0] == 43)
        {
            isnegative = false;
        }
        else if((int)arr[0] == 45)
        {
            isnegative = true;
        }
        else
        {
            a = (long)arr[0];
            if(a<48 || a>57)
            {
                return 0;
            }
            a = a-48;
            sum = sum*10 + a;
        }
        for(int i=1; i<arr.length; i++)
        {
            a = (long)arr[i];
            if(a<48 || a>57)
            {
                break;
            }
            a = a-48;
            sum = sum*10 + a;
            if(sum >= Integer.MAX_VALUE || sum<=Integer.MIN_VALUE)
            {
                break;
            }
        }
        if(isnegative)
        {
            sum = sum *(-1);
        }
       /* Handle overflow underflow conditions */
        if(sum >= Integer.MAX_VALUE) 
        {
            return Integer.MAX_VALUE;
        }
        if(sum <= Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }
        return (int)sum;
    }
}
