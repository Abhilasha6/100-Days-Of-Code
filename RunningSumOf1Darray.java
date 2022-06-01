//day 81
//review again

public class RunningSumOf1Darray {
    public int[] runningSum(int[] nums) {
        int i = 1;
        while (i<nums.length){
            nums[i]+=nums[i-1];
            i++;
        }
        return nums;
    }
}
