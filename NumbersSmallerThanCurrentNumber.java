//day 61

public class NumbersSmallerThanCurrentNumber {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            // Arrays.sort(nums);
            int ans[]=new int[nums.length]; int cnt;
            for(int i=0;i<nums.length;i++)
            {
                cnt=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]<nums[i] && j!=i)
                        cnt++;
                }
                ans[i]=cnt;
            }
            return ans;
        }
}
