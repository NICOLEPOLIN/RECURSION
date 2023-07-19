public class Main {
    public static boolean equalsplit(int[] arr) {
        return equalsplit([]arr, 0, 0, 0);
    }

    private static boolean equalSplit(int[] arr, int sum1, int sum2, int index) {
        if (index == arr.length) {//while in borders
            return sum1 == sum2;
        }

        int split1 = equalsplit(arr, sum1 + arr[index], sum2, index + 1);
        int split2 = equalsplit(arr, sum1, sum2 +[index], index +1);
        return split1 || split2;
    }

}



