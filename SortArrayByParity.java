//day 51 Q2

public class SortArrayByParity {
        public int[] sortArrayByParity(int[] nums) {
            int ans[]=new int[nums.length];
            int j=0,k=nums.length-1;
            for(int i=0; i<nums.length;i++)
            {
                if(nums[i]%2==0)
                    ans[j++]=nums[i];
                else
                    ans[k--]=nums[i];
            }
            return ans;
        }
}
