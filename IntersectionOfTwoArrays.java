//day 23
public class IntersectionOfTwoArrays {
    class Solution {
        public int[] intersection(int[] nums1, int[] nums2) {
            int l= Math.max(nums1.length,nums2.length);
            Arrays.sort(nums1);
            int k=0,x=0;
            int nums11[]=new int[nums1.length];
            
            //checking for duplicates in nums1 array
            for(int i=0;i<nums1.length;i++)
            {
                if(i<nums1.length-1 && nums1[i]==nums1[i+1])
                    continue;
                else
                    nums11[x++]=nums1[i];
            }
            
            //finding common in both arrays
            int[] arr=new int[x];
            for(int i=0;i<x;i++)
            {
                for(int j=0;j<nums2.length;j++)
                    if(nums11[i]==nums2[j])
                    {
                        arr[k++]=nums11[i];
                        // cnt++;
                        break;
                    }
            }
            
            //displaying the final array
            int res[]=new int[k];
            for(int i=0;i<k;i++){
              // if(k==1) return arr;
              // if(i<k-1 && arr[i]==arr[i+1])
              //       continue;
              else
              {
                  res[i]=arr[i]; 
                  // x++;
              }
            }
               
            return res;
        }
    }
}
