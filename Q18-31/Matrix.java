public class Matrix {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];
        int[][] product = new int[2][2];

        // Addition
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                sum[i][j] = a[i][j] + b[i][j];

        System.out.println("Matrix Addition:");
        printMatrix(sum);

        // Multiplication
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int k = 0; k < 2; k++)
                    product[i][j] += a[i][k] * b[k][j];

        System.out.println("Matrix Multiplication:");
        printMatrix(product);
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
