// day 82

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int trans[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++)
                trans[j][i] = matrix[i][j];
        return trans;
    }
}
