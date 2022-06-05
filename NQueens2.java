// day 85 review hard

public class NQueens2 {
    public int totalNQueens(int n) {
        int[][] attack = new int[n][n];  // > 0 -> could be attacked
        return backtrack(0, n, attack);
      }
      
      // d is the depth (here it means the current row)
      private int backtrack(int d, int n, int[][] attack) {
        // base case
        if (d == n) {
          return 1;
        }
        // backtrack
        int count = 0;
        for (int i = 0; i < n; ++i) {
          if (attack[d][i] == 0) {
            updateAttack(d, i, n, attack);
            count += backtrack(d + 1, n, attack);
            restoreAttack(d, i, n, attack);
          }
        }
        return count;
      }
      
      
      private void updateAttack(int i, int j, int n, int[][] attack) {
        // update all below/hill/dale positions by +1
        for (int k = i + 1, offset = 1; k < n; ++k, ++offset) {
          attack[k][j] += 1; // mid
          if (j - offset >= 0) attack[k][j - offset] += 1; // left
          if (j + offset < n) attack[k][j + offset] += 1; // right
        }
      }
      
      private void restoreAttack(int i, int j, int n, int[][] attack) {
        // restore all below/hill/dale positions by -1
        for (int k = i + 1, offset = 1; k < n; ++k, ++offset) {
          attack[k][j] -= 1;
          if (j - offset >= 0) attack[k][j - offset] -= 1; // left
          if (j + offset < n) attack[k][j + offset] -= 1; // right
        }
      }
}
