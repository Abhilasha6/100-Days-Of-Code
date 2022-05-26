// day 75

public class MinimumSumOf4DigitNo {
    public int minimumSum(int num)
    {
        int[] arr = new int[4]; 
        int i = 0;
        while(num != 0) 
        {
            arr[i++] = num % 10;
            num /= 10;
        }
        Arrays.sort(arr); 
        int num1 = arr[0] * 10 + arr[2]; // 1st and 3rd digit
        int num2 = arr[1] * 10 + arr[3]; // 2nd and 4th digit
        return num1 + num2;
    }
}
