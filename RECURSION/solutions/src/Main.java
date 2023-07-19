public class Main {
    public static int solutions(int num) {
        return solutions(num, 0, 0, 0);
    }

    private static int solutions(int num, int x1, int x2, int x3) {
        if (num < 3 || num > 30) {
            return 0; // if num is not following the conditions
        }
        if (x1 < 1 || x1 > 10 || x2 < 1 || x2 > 10 || x3 < 1 || x3 > 10) {
            return 0; // if param not following the condition
        }

        int count = 0;
        if (x1 + x2 + x3 == num) {
            System.out.println(x1 + "+" + x2 + "+" + x3);
            count++;
        }
        if (x1 == 10 && x2 == 10 && x3 == 10)//10+10+10=30
            return count;
        if (x3 != 10)
            x3++;
        else {
            x3 = 1;
            x2++;
            if (x2 > 10) {
                x2 = 1;
                x1++;
            }
        }
        return count + solutions(num, x1, x2, x3);//recursive call
    }

    public static void main(String[] args) {
        int num = 15;
        int result = solutions(num);
        System.out.println("Number of solutions: " + result);
    }
}
