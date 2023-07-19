
    public class Main {
        public static void fillDamarMatrix(int[][] matrix) {
            fillDamarMatrix(matrix, 0);
        }

        private static void fillDamarMatrix(int[][] matrix, int row) {
            // Base case: Reached the last row
            if (row == matrix.length) {
                return;
            }

            int n = matrix.length;
            int half = n / 2;

            // Fill the current row with alternating 1 and -1 values
            for (int col = 0; col < n; col++) {
                matrix[row][col] = (col / half) % 2 == 0 ? 1 : -1;
            }

            // Recursively fill the remaining rows
            fillDamarMatrix(matrix, row + 1);
        }

        public static void main(String[] args) {
            int n = 4; // Size of the matrix
            int[][] damarMatrix = new int[n][n];

            fillDamarMatrix(damarMatrix);

            // Print the filled damarMatrix
            for (int[] row : damarMatrix) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }

