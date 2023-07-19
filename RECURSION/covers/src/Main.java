public class Main {
        public static boolean covers(int[] arr1, int[][] arr2, int k) {
            return coversRecursive(arr1, arr2, k, 0, 0);
        }

        private static boolean coversRecursive(int[] arr, int[][] mat, int k, int row, int sum) {
            if (sum == k) {
                return true;//if we found the numbers of rows equal to k
            }

            if (row == mat.length || sum > k) {
                return false;
            }
            for (int i = 0; i < mat[row].length; i++) {
                if (coversRecursive(arr, mat, k, row + 1, sum + mat[row][i])) {
                    return true;
                }
            }
            return coversRecursive(arr, mat, k, row + 1, sum);
        }
}//end main