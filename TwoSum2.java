//day 88

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
    while (numbers[l] + numbers[r] != target) {
        if (numbers[l] + numbers[r] > target) r--;
        else l++;
    }
    return new int[]{l + 1, r + 1};
    };
}
