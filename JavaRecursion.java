public class JavaRecursion {
    /*
     *
     * Recursion technique is using for call a function in it's function itself.
     * The technique provides a way to break complicated probles down into more
     * simple that easier to solve, and it's a little bit difficult to understand.
     * 
     */
    public static void main(String[] args) {
        // int result = sum(10);
        // System.out.println(result);
        /*
         * The result is 55, but How?
         * 10 + ( 9 + ( 8 + sum(7) ) ) ....
         * 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
         */

        int result2 = sumWithRange(5, 10);
        System.out.println(result2);

        /*
         * the result is 45, heres how
         * sumWithRange(5,10)
         */

         int result3 = factorial(4);
         System.out.println(result3);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static int sumWithRange(int start, int end) {
        if (end > start) {
            // System.out.println("[" + end + "," + start + "]");
            return end + sumWithRange(start, end - 1);
        } else {
            return end;
        }
    }

    public static int factorial(int num) {
        if (num > 0) {
            return num * factorial(num - 1);
        } else {
            return 1;
        }
    }
}
