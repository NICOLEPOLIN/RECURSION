public class Main {
    public static int shortestPath(int[][] mat) {
        int i = 0;
        int j = 0;
        return shortestPath(mat, i, j);
    }

    private static int shortestPath(int[][] mat, int i, int j) {
        if (i >= 0 && i < mat.length && j >= 0 && j < mat[0].length) {
            int sum1 = 0;
            if (mat[i][j] < mat[i + 1][j]) { // down
                sum1 = shortestPath(mat, i + 1, j);
            }
            int sum2 = 0;
            if (mat[i][j] < mat[i][j + 1]) { // right
                sum2 = shortestPath(mat, i, j + 1);
            }
            int sum3 = 0;
            if (mat[i][j] < mat[i][j - 1]) { // left
                sum3 = shortestPath(mat, i, j - 1);
            }
            int sum4 = 0;
            if (mat[i][j] < mat[i - 1][j]) { // up
                sum4 = shortestPath(mat, i - 1, j);
            }
            return Math.min(Math.min(sum1, sum2), Math.min(sum3, sum4));
        }
        return Integer.MIN_VALUE;
    }
}
