public class RemoveDuplicates {
        public int removeDuplicates(int[] nums) {
            int i,j=0;
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
