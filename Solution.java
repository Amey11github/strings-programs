import java.util.*;

class Solution {
   

    public static void main(String[] args) {
       int [] nums1={1,3};
       int [] nums2={2};

       double op=findMedianSortedArrays(nums1,nums2);
       System.out.println(op);
    }
     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int [] sort=new int[nums1.length+nums2.length];
      int indx=0;
      for(int i=0;i<nums1.length;i++)
      {
         for(int j=0;j<nums2.length;j++)
         {
            for(int k=0;k<sort.length;k++)
            sort[k]=nums2[j];
         }
         
      }

      System.out.println(Arrays.toString(sort));

      return 0;
        
    }
}