public class Main {
    public class Fibonacci {
        public static int fibonacci(int n) {
            // Base cases: n=0 and n=1
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }

            // Recursive case: sum of the previous two Fibonacci numbers
            return fibonacci(n - 1) + fibonacci(n - 2);
        }


    }

}