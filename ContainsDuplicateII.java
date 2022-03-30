public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Arrays.sort(nums);
        
        //brute force algo works effectively but it may timeout for very large input array
        // for(int i=0;i<nums.length;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)            
        //         if((nums[i]==nums[j] )&& (Math.abs(i-j)<=k))
        //             return true;
        // }
        // return false;

        // for more efficiency we can use HashMap or HashSet algo
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++)
        {
            if(map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                return true;    
            map.put(nums[i] , i);
        }
        return false;
    }
}
