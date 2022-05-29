// day 78
// review again medium diff q

public class MaxProdOfWordLengths {
    public int maxProduct(String[] words) {
        int[][] w = new int[words.length][26];
        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();
            for (char ch : arr) {
                w[i][ch - 'a']++;
            }
        }
        int res = 0;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                int s = 0;
                for (int k = 0; k < 26; k++) {
                    if (w[i][k] > 0 && w[j][k] > 0) {
                        s = 1;
                        break;
                    }
                }
                if (s == 0) {
                    res = Math.max(res, words[i].length() * words[j].length());
                }
            }
        }
        return res;
    }
}
