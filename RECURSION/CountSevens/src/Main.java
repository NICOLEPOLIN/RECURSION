public class Main {
    public class CountSevens {
        public static int countSevens(int n) {
            if (n == 0) {//first condition
                return 0;
            } else if (n % 10 == 7) {
                return 1 + countSevens(n / 10);//recursive call1
            } else {
                return countSevens(n / 10);//recursive call 2
            }
        }


    }

}