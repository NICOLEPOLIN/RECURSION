public class Main {
    public static int findMaxprice(int[] price, int n) {
        return findMaxprice([]price, n, 0);
    }

    private static int findMaxprice(int[] price, int n, int sum) {
        if (i > n) {//if we are out borders
            return 0;
        if (n == 0)
            return 0;//out tf pieces
         return Math.max(prices[i] + findMaxprice(prices, n - i, i), findMaxprice(prices, n, i + 1));
            //take it or no take it
        }
    }
    //option 2 code:
    public class RecursionExample {

        public static int getMaxPrice(int[] prices, int N) {
            return getMaxPriceRecursive(prices, N, 0, 0);
        }

        private static int getMaxPriceRecursive(int[] prices, int N, int index, int sum) {
            if (index >= prices.length || index >= N) {//out of borders
                return sum; // אם הגענו לסוף המערך או לאורך המקל, מחזירים את סכום המחירים
            }

            int price = prices[index];
            int newSum = sum + price;

            int withCurrent = getMaxPriceRecursive(prices, N, index + 1, newSum); // מחיר כולל את החתיכה הנוכחית
            int withoutCurrent = getMaxPriceRecursive(prices, N, index + 1, sum); // מחיר ללא החתיכה הנוכחית

            return Math.max(withCurrent, withoutCurrent); // מחזירים את המחיר המקסימלי בין האפשרויות
            //take it or no take it
        }
    }

}