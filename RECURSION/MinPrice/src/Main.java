public class MinimumPriceFinder {
    public static int findMinimumPrice(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // יצירת מטריצה דינמית עם ערכי המחיר המינימליים
        int[][] minPrices = new int[n][m];
        minPrices[0][0] = matrix[0][0]; // מחיר התחנה הראשונה

        // חישוב ערכי המחיר המינימליים עבור התאים השארים
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < Math.min(i + m + 1, n); j++) {
                if (matrix[j][0] != -1) {
                    minPrices[j][0] = Math.min(minPrices[j][0], minPrices[i][0] + matrix[j][0]);
                }
            }

            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    continue;
                }

                for (int k = i + 1; k < Math.min(i + j + 1, n); k++) {
                    if (matrix[k][j] != -1) {
                        minPrices[k][j] = Math.min(minPrices[k][j], minPrices[i][j - 1] + matrix[k][j]);
                    }
                }
            }
        }

        int minimumPrice = minPrices[n - 1][m - 1];
        return minimumPrice;
    }
}
