public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)            
                if((nums[i]==nums[j] )&& (Math.abs(i-j)<=k))
                    return true;
        }
        return false;
    }
}
