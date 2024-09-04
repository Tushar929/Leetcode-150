import java.util.Arrays;

public class SetMatrixZeroes_73 {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int rows[] = new int[m];
        int cols[] = new int[n];

        Arrays.fill(rows, 1);
        Arrays.fill(cols, 1);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = 0;
                    cols[j] = 0;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] == 0 || cols[j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Main method to test the function
    public static void main(String[] args) {
        SetMatrixZeroes_73 obj = new SetMatrixZeroes_73();
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        System.out.println("Original Matrix:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }

        obj.setZeroes(matrix);

        System.out.println("Matrix after calling setZeroes:");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
