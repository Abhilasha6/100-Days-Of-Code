//day 76

public class NoOfStepsToReduceTo0 {
    public int numberOfSteps(int num) {
        // iterative approach
        int count = 0; // count of steps
        while (num != 0) { // while num is not 0
            if (num % 2 != 0) // if num is odd
                --num; // decrement num
            else // if num is even
                num = num / 2; // divide num by 2
            ++count; // increment count
        }
        return count; // return count

        // recursive approach
        if (num == 0) {
            return 0;
        } else if (num % 2 == 0) {
            return (numberOfSteps(num / 2) + 1);
        } else if (num % 2 == 1) {
            return (numberOfSteps(num - 1) + 1);
        }
        return 0;
    }
}
