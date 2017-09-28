import java.io.*;
class Solution 
{
    public int low=0, max_len=0;
    public String longestPalindrome(String s) 
    {
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            check_palindrome(s,i,i);
            check_palindrome(s,i,i+1);
        }
        return s.substring(low, max_len+low);
    }
    public void check_palindrome(String s, int i,int j)
    {
        while(i>=0 && j<s.length() && s.charAt(i)==s.charAt(j))
        {
            i--;
            j++;
        }
        if(max_len < j-i-1)
        {
            max_len = j-i-1;
            low = i+1;
        }
    }
}
