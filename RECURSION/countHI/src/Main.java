public class Main {
    public class CountHi {
        public static int countHi(String str) {
            // Base case: empty string or string length less than 2
            if (str.length() < 2) {
                return 0;
            }

            // Check if the substring from index 0 to 2 is "hi"
            if (str.substring(0, 2).equals("hi")) {
                // If it is, count it and recurse on the remaining part of the string
                return 1 + countHi(str.substring(2));
            } else {
                // If it's not, simply recurse on the remaining string
                return countHi(str.substring(1));
            }
        }
    }

}