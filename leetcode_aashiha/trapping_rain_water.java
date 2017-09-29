class Solution 
{
    public int trap(int[] height) 
    {
        int left_max=0, right_max=0, max=0;
        int left = 0;
        int right = height.length-1;
        while(left <= right)
        {
            left_max = Math.max(left_max, height[left]);
            right_max = Math.max(right_max, height[right]);
            if(left_max < right_max)
            {
                max = max + (left_max - height[left]);
                left++;
            }
            else
            {
                max = max + (right_max - height[right]);
                right--;
            }
        }
        return max;
    }
}
