public class IntersectionOfTwoArrays2 {
     public int[] intersect(int[] nums1, int[] nums2) {
            int k=0;     //k=length of intersected array
            
            //finding intersection between arrays
            int arr[]=new int[nums1.length];
            for(int i=0;i<nums1.length;i++)
            {
                for(int j=0;j<nums2.length;j++){
                    if(nums1[i]==nums2[j])
                    {
                             arr[k++]=nums1[i];
                             nums2[j]=1001; // by changing the value of the intersected element to a value > allowed constraint, we can avoid duplicate comparisions with nums1 array
                             break;
                    }
                }     
            }
            
            //displaying final array using 'k' so that if any extra null space is present, it will get skipped.
            int res[]=new int[k]; 
            for(int i=0;i<k;i++)
                res[i]=arr[i];
            
            return res;
        }
}
