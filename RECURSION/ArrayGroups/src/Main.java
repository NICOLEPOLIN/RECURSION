public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }public class ArrayGroups {
        public static boolean canDivideArray(int[] nums) {
            return divideArrayHelper(nums, 0, 0, 0);
        }

        private static boolean divideArrayHelper(int[] nums, int index, int sumMultipleOf5, int sumMultipleOf3) {
            // Base case: all elements have been processed
            if (index == nums.length) {
                return sumMultipleOf5 == sumMultipleOf3;
            }

            // Recursive case: consider the current element
            int currentNum = nums[index];

            if (currentNum % 5 == 0) {
                // Current number is a multiple of 5, add it to the sumMultipleOf5 group
                return divideArrayHelper(nums, index + 1, sumMultipleOf5 + currentNum, sumMultipleOf3);
            } else if (currentNum % 3 == 0) {
                // Current number is a multiple of 3 (and not a multiple of 5), add it to the sumMultipleOf3 group
                return divideArrayHelper(nums, index + 1, sumMultipleOf5, sumMultipleOf3 + currentNum);
            } else {
                // Current number is not a multiple of 3 or 5, try adding it to both groups
                return divideArrayHelper(nums, index + 1, sumMultipleOf5 + currentNum, sumMultipleOf3) ||
                        divideArrayHelper(nums, index + 1, sumMultipleOf5, sumMultipleOf3 + currentNum);
            }
        }


    }

}