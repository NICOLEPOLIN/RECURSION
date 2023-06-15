public class Main {
    public static int longestWorm(int[][] mat) {
        return longestWorm(mat, 0, 0);//help method
    }

    private static int longestWorm(int[][] mat, int i, int j) {//private method
        if (i < mat.length && j < mat[0].length) { // while we are in the borders of mat
            int sum = 0;//define the sum
            if (i + 1 < mat.length && j + 1 < mat[0].length && mat[i + 1][j + 1] - mat[i][j] == 1) {
                // if they are following numbers
                // recursive calls:
                sum += longestWorm(mat, i + 1, j); // up
                sum += longestWorm(mat, i - 1, j); // down
                sum += longestWorm(mat, i, j + 1); // right
                sum += longestWorm(mat, i, j - 1); // left
                return sum;
            }
            return 0; // if we are not in the borders
        }
        return 0; // if we are out of bounds
    }
}
