// day 91

import java.util.*;
public class MaximumErasureValue {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        int sum = 0, ans = 0;

        for (int i = 0, j = 0; j < nums.length;) {
            if (!set.contains(nums[j])) {
                sum += nums[j];
                set.add(nums[j]);
                j++;
                ans = Math.max(sum, ans);
            } else {
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
        }
        return ans;
    }
}
