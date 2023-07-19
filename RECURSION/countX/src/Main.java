public class Main {
    //במחרוזת נתונה צריך לחשב כמה פעמים הX הקטנה מופיעה במחרוזת ולהחזיר את הסכום מופעים
    public class CountX {
        public static int countX(String str) {
            // Base case: empty string
            if (str.isEmpty()) {//bad case:
                return 0;
            }

            char firstChar = str.charAt(0);
            String remainingStr = str.substring(1);

            if (firstChar == 'x') {
                // If first character is 'x', count it and recurse on the remaining string
                return 1 + countX(remainingStr);
            } else {
                // If first character is not 'x', simply recurse on the remaining string
                return countX(remainingStr);
            }
        }


    }

}//It uses a base case where an empty string has 0 occurrences of 'x'.
// It then checks the first character of the string, and if it is 'x',
// it counts it and recursively calls the countX method on the remaining part of the string.
// If the first character is not 'x', it simply recursively calls the method on the remaining string.
// The counts are accumulated and returned.