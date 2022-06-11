// day 90
// medium level .. good question review answer

public class MinOpToReduceXto0 {
        public int minOperations(int[] nums, int x) {
            // for(int i=0;i<nums.length;i++)
            // {
            //     if(x<nums[i])
            //         return -1;
            // }
            
            int sum = 0;
        for (int num: nums) 
            sum += num; //11
    
        int maxLength = -1, currSum = 0;
        for (int l=0, r=0; r<nums.length; r++) {
            currSum += nums[r];
            while (l <= r && currSum > sum - x) 
                currSum -= nums[l++];
            if (currSum == sum - x) 
                maxLength = Math.max(maxLength, r-l+1);
        }
    
        return maxLength == -1 ? -1 : nums.length - maxLength;
        }
    }
