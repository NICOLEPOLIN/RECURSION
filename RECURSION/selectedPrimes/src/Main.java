public class Main {
    public static int selectedPrimes(int num,int x,int currentPrime,int count){
        if(num<currentPrime|| num==1)
            return count;
        if(x==countpow(num,currentPrime,0)) {
            system.out.println(currentPrime + "");
            return selectedPrimes(num / Math.pow(currentPrime, x), x, nextPrime(curentPrime), count + 1);
        }
        return selectedPrimes(num,x,nextPrime(currentPrime),count);
        }
        private static int countPow(int num,int current,count) {
            if (num % current != 0 || num == 1)
                return count;
            return countPow(num / current, current, count + 1);
        }
        public static int selectedPrimes(int num,int x) {
            return selectedPrimes(num, x, 2, 0);
        }
    }
}