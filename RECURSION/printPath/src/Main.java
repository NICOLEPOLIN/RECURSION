public class Main {
    public static void printPath(int[][] mat) {
        printPath(mat, 0, 0);
    }
//backtracking
    private static void printPath(int[][] mat, int i, int j) {
        System.out.print("(" + i + "," + j + ")");
        if (i - 1 >= 0) {
            if (mat[i][j] < mat[i - 1][j]) {//Next, the function checks if it is possible to move to the cell above (i - 1)
                // and if the value in the current cell (mat[i][j])
                // is smaller than the value in the cell above (mat[i - 1][j]).
                // If the condition is met, the function makes a recursive call to printPath with updated indices i - 1 and j,
                // effectively moving one step up in the matrix.
                printPath(mat, i - 1, j);//first recursive call-down
                return;
            }
        }
        if (j - 1 >= 0) {
            if (mat[i][j] < mat[i][j - 1]) {//the function proceeds to check the possibility of moving to the left (j - 1),
                // the right (j + 1), and the bottom (i + 1) cells in a similar manner.
                printPath(mat, i, j - 1);//second recursive call-left
                return;
            }
        }
        if (i + 1 <= mat.length - 1) {
            if (mat[i][j] < mat[i + 1][j]) {
                printPath(mat, i + 1, j);//third recursive call-up
                return;
            }
        }
        if (j + 1 <= mat[0].length - 1) {
            if (mat[i][j] < mat[i][j + 1]) {
                printPath(mat, i, j + 1);//fourth recursive call-right
                return;
            }
            //The recursion continues until no further movement is possible
            // based on the conditions. At that point, the function returns to the previous recursive call,
            // which allows the function to backtrack and explore other paths.
        }
    }
}




