import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums==null || nums.length<2)
        return new int[]{0,0};
        else{
        for(int i=0;i<nums.length;i++)
        {
           
            for(int j=i+1;j<nums.length;j++)
                // if(nums[i]==target||nums[j]==target)
                //     return i;
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
            }
            
        }
         return null;
    }
   
}