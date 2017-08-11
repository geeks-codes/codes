//1 number is missing in an array within given range. finding the missing number using xor operations.
//x1 = xor all elements of array
//x2 = xor numbers from 1 to range
//missing number = x1 xor x2

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    public static int find_missing(int[] arr,int len)
    {
        int x1=arr[0],x2=1,x3;
        for(int i=1;i<arr.length;i++)
        {
            x1 = x1 ^ arr[i];
        }
        for(int j=2;j<=len;j++)
        {
            x2 = x2 ^ j;
        }
        x3 = x1 ^ x2;
        return x3;
    }
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		for(int i=0;i<num;i++)
		{
		    int len = scan.nextInt();
		    int[] arr = new int[len];
		    for(int j=0;j<len-1;j++)
		    {
		        arr[j] = scan.nextInt();
		    }
		    int num1 = find_missing(arr,len);
		    System.out.println(num1);
		}
	}
}
