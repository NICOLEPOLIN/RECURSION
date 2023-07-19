public class Main {
    public int sumDigits(int n) {


        // Base case: If n is less than 10, it is a single digit number
        if (n < 10) {
            return n;
        } else {
            // Recursive case: Calculate the sum of digits for n by adding the rightmost digit to the sum of digits for the remaining part
            return n % 10 + sumDigits(n / 10);
        }



    }
}