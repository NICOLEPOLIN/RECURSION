public class Main {
    public class ArrayDivider {
        public static boolean canDivideArray(int[] array) {
            return divideArray(array, 0, 1, 1);//the help function
        }

        private static boolean divideArray(int[] array, int index, int product1, int product2) {
            if (index == array.length) {
                return product1 == product2;
            } else {
                // the recursive call
                return divideArray(array, index + 1, product1 * array[index], product2) ||
                        divideArray(array, index + 1, product1, product2 * array[index]);
            }
        }

    }

}