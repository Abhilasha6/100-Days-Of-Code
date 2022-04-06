public class MergeSortedArray {
    class Solution {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
            int merge[]=new int[m+n];
            int c=0;
            if(m==1 && n==0)
                System.out.print(nums1[0]);
            else if(m==0 && n==1){
                nums1[0]=nums2[0];
                System.out.print(nums1[0]);
            }
                // System.out.print(nums1[0]+nums2[0]);
                // for(int i=0;i<m+n;i++) System.out.print(nums2[0]);
            // else if(m==0 || n==0) 
            //     for(int i=0;i<m+n;i++)
            //          if(nums1[i]==0 || nums2[i]==0)
            //            System.out.print(nums1[i]+nums2[i]);
            
            // if(m==0 || n==0){
            //     // if(n==0)
            //         System.out.print(nums1[0]+nums2[0]);
            // }
            else{
                // merge=nums1;
            // for(int i=0;i<m;i++)
            // {
                for(int j=0;j<n;j++)
                {
                    // if(nums1[j]==0 || nums2[j]==0)
                    //     merge[m++]=nums1[j]+nums2[j];
                    // if(nums1[i]==nums2[j]){
                        nums1[m++]=nums2[j];
                        // nums2[j]=-1;
                    // }
                }
            // }
            // c=merge.length;
            Arrays.sort(nums1);
            for(int i=0;i<m;i++) System.out.print(nums1[i]);
            }
        }
    }
}
