//day 22
public class ThirdMaximumNumber {
    class Solution {
        public int thirdMax(int[] nums) {
            Arrays.sort(nums);
            int cnt=0;
            // int[] nodup=new int[nums.length];
           // for(int i=0;i<nums.length-1;i++){
           //      if(i<nums.length-1 && nums[i]==nums[i+1])
           //         continue;
           //     else
           //     {
           //         nums[j]=nums[i];
           //         j++;
           //     }
           // }
            for(int i=nums.length-1;i>=nums.length-4;i--)
            {
                if(i>nums.length-2 && nums[i]==nums[i-1])
                    continue;
                if(nums.length<=2)
                    return nums[nums.length-1];
                // else if(nums.length==3) 
                //     return nums[0];
                // else
                    // return nums[nums.length-4];
                else if(i>nums.length-2 && nums[i]>nums[i-1]){
                    cnt++;
                if(cnt==3)
                    return nums[i];
                }
                
            }
        return nums[0];
        }
    }
}
