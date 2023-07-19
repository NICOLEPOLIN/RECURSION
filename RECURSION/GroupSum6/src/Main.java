public class Main {
    public class GroupSum6 {
        public static boolean groupSum6(int[] nums, int start, int target) {
            // Base cases
            if (start >= nums.length) {
                return target == 0;
            }

            if (nums[start] == 6) {
                return groupSum6(nums, start + 1, target - 6);
            }

            // Recursive case
            return groupSum6(nums, start + 1, target - nums[start]) ||
                    groupSum6(nums, start + 1, target);
        }
    }