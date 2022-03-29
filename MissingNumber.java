//day 19
public class MissingNumber {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==i)
                continue;
            else
                return i;
        }
        return nums.length;
    }
}
