// day 93

public class DeleteOperationFor2Strings {
    public int minDistance(String word1, String word2) {
        int opt[][] = new int[word1.length() + 1][word2.length() + 1];
        for (int i = 0; i <= word1.length(); i++) {
            for (int j = 0; j <= word2.length(); j++) {
                if (i == 0 || j == 0)
                    continue;
                if (word1.charAt(i - 1) == word2.charAt(j - 1))
                    opt[i][j] = 1 + opt[i - 1][j - 1];
                // when the char match we take diagonal value + match cost
                // assuming match cost =1 here
                else
                    opt[i][j] = Math.max(opt[i - 1][j], opt[i][j - 1]);
                // if they do not match then we take max value for returning min steps
                // thats the formula for solvin gthis problem using dynamic programming approach
                // assuming gap and mismatch penalty to be zero here
            }
        }
        return word1.length() + word2.length() - 2 * opt[word1.length()][word2.length()];
    }
}
