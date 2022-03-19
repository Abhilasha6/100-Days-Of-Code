import java.util.*;
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int i;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++)
	{
		if(i<nums.length-2&&nums[i]!=nums[i+1])
		{
			return nums[i];
		}
        else if(i==nums.length-1)
		{
			return nums[i];
			
		}
		else
		{
			i++;
		}
	}
        return 0;
    }
}
