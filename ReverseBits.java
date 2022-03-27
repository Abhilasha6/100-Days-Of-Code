//day 17
public class ReverseBits {
    public int reverseBits(int n) {
        String b = Integer.toBinaryString(n);
        char[] s = new char[32];
        for (int i = 0; i < 32 - b.length(); i++) s[i] = '0';
        for (int i = 0; i < b.length(); i++) s[i + (32 - b.length())] = b.charAt(i);
        int l = 0, h = s.length - 1;
        while (l < h) swap(s, l++, h--);
        return Integer.parseUnsignedInt(String.valueOf(s), 2);
    }

    private void swap(char[] A, int i, int j) {
        char temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
