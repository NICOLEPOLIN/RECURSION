public class Main {

   // Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
   // except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
   // Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
   // while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
   public class Count8 {
       public static int count8(int n) {
           // Base case: no digits left
           if (n == 0) {
               return 0;
           }

           int lastDigit = n % 10;
           int remainingDigits = n / 10;

           if (lastDigit == 8) {
               // Consecutive 8's count as double
               if (remainingDigits % 10 == 8) {
                   return 2 + count8(remainingDigits);
               } else {
                   return 1 + count8(remainingDigits);
               }
           } else {
               // No 8 in this digit
               return count8(remainingDigits);
           }
       }

       public static void main(String[] args) {
           System.out.println(count8(8818)); // Output: 4
           System.out.println(count8(12345)); // Output: 0
           System.out.println(count8(88888)); // Output: 10
       }
   }


}