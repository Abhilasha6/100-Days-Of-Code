public class RemoveDuplicates {
    class Solution {
        public int removeDuplicates(int[] nums) {
            int i,j=0;
            // int j=nums.length-1;
            // for(i=nums.length-1;i>=0;i--)
            // {
            //     if(nums[i]==nums[i-1])
            //         continue;
            //     else
            //         nums[j]=nums[i];
            //     j--;
            // }
            // return nums.length;
            for(i=0;i<nums.length;i++)
            {
                if(i<nums.length-1 && nums[i]==nums[i+1])
                    continue;
                else{
                    nums[j]=nums[i];
                    j++;
                }
                    
            }
            return j;
        }
    }
}
