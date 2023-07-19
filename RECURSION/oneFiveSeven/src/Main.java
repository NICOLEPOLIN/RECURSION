public class Main {

    public static int oneFiveSeven(int n) {
        if (n < 0) {//if can be
            return Integer.MAX_VALUE;
        } else if (n == 0) {//there are no connectors only 0
            return 0;  //
        } else {//backtracking-recursivecall
            int one1 = oneFiveSeven(n - 1);
            int five5 = oneFiveSeven(n - 5);
            int seven7 = oneFiveSeven(n - 7);
            return 1 + Math.min(Math.min(one1, five5), seven7);//return the min connectors
        }
    }

}
