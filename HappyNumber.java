//day 29

public class HappyNumber {
    public boolean isHappy(int n) {

        return sod(n);

    }

    // finding digits & sum of squares of digits
    public static boolean sod(int x) {
        if (x == 1 || x == 7)
            return true;
        else if (x < 10 && x > 1)
            return false;
        int d, ss = 0;
        for (int i = 0; x > 0; i++) {
            d = x % 10;
            ss = ss + d * d;
            x = x / 10;
        }
        x = ss;
        return sod(x);
    }
}
