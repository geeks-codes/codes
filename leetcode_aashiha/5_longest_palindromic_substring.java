import java.io.*;
class Solution 
{
    public boolean isPalindrome(String s1)
    {
        String s2 = new StringBuffer(s1).reverse().toString();
        //System.out.println("\n is palindrome "+s1+"  "+s2);
        return s1.equals(s2);
    }
    public String longestPalindrome(String s) 
    {
        int len = s.length();
        char[] arr = s.toCharArray();
        int max_len = 0;
        String max_str = "";
        for(int i=0;i<len;i++)
        {
            int j=i;
            while(j<=len)
            {
                String s1 = s.substring(i,j);
                if(isPalindrome(s1))
                {
                    if(s1.length() > max_len)
                    {
                        max_len = s1.length();
                        max_str = s1;
                    }
                }
                j++;
            }
        }
        return max_str;
    }
}
