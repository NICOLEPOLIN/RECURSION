public class Main {
    public static int prince(int[][] drm, int i, int j) {
        return prince(drm, i, j, 0, drm.length);
    }

    private static int prince(int[][] drm, int i, int j, int steps, int len) {
        if (i < 0 || i >= len || j < 0 || j >= len) {
            return Integer.MAX_VALUE; // Return a high value to avoid considering out-of-bounds paths
        }

        if (drm[i][j] == -1) {
            return steps; // Return the number of steps taken when reaching the evil
        }

        if (drm[i][j] == -2) {
            return Integer.MAX_VALUE; // Return a high value to avoid considering paths with obstacles (-2)
        }

        // Mark the current cell as visited (-2) to avoid revisiting it
        int prevValue = drm[i][j];
        drm[i][j] = -2;

        int west = prince(drm, i, j - 1, steps + 1, len);
        int east = prince(drm, i, j + 1, steps + 1, len);
        int north = prince(drm, i - 1, j, steps + 1, len);
        int south = prince(drm, i + 1, j, steps + 1, len);

        // Restore the previous value of the current cell
        drm[i][j] = prevValue;

        return Math.min(Math.min(west, east), Math.min(north, south));//return the min of all paths
    }




}