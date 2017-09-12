class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] arr =new int[l1+l2];
        int i=0, j=0, k=0;
        int mid = ((l1 + l2)/2);
        double a=0;
      //  System.out.println(l1+"  "+l2);
        while(i<l1 && j<l2)
        {
            if(nums1[i]<nums2[j])
            {
                arr[k++] = nums1[i];
                i++;
            }
            else if(nums1[i]>=nums2[j])
            {
                arr[k++] = nums2[j];
                j++;
            }
        }
        while(i<l1)
        {
            arr[k++] = nums1[i];
            i++;
        }
        while(j<l2)
        {
            arr[k++] = nums2[j];
            j++;
        }
        //System.out.println("arr"+mid);
        if((l1 + l2) % 2 != 0)
        {
            a = (double)arr[mid];
        }
        else
        {
          //  System.out.println("Entered here"+mid+"  "+arr[0]+"  "+arr[1]);
            int a1 = arr[mid];
            int a2 = arr[mid-1];
         //   System.out.println(a1 + "  "+a2);
            a  = ((double)a1+(double)a2)/2;
        }
        
        return a;
    }
}
