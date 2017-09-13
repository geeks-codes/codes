class Solution 
{
    public boolean isPalindrome(int x) 
    {
        int y=0,z=x;
        while(x>0)
        {
            int d = x%10;
            y = y*10 + d;
            x = x/10;
        }
        System.out.println("x : "+x+" y: "+y);
        if(z == y)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
