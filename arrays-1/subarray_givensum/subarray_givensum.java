//Finds the contiguous subarray with given sum and prints the start index and stop index in array
//Example : [1,3,3,2,-5} given sum : 8, output : start_index = 2, stop_index = 4

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG 
{
    public static int kadane_algorithm(int[] arr)
    {
        int max_curr = arr[0], max_sum = arr[0];
        int max = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>(max_curr+arr[i]))
            {
                max_curr = arr[i];
            }
            else
            {
                max_curr = max_curr + arr[i];
            }
            max_sum = Math.max(max_curr,max_sum);
        }
        return max_sum;
    }
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i=0;i<n;i++)
		{
		    int len = scan.nextInt();
		    int[] arr = new int[len];
		    for(int j=0;j<len;j++)
		    {
		        arr[j] = scan.nextInt();
		    }
		    int sum = kadane_algorithm(arr);
		    System.out.println(sum);
		}
	}
}
