public class JavaMethodOverloading {
    /*
     * You can create method with same name but have different params
     * It's called overloading
     * Ex: if you have two same method, but you want to make that method
     * can handle two type of data int and double.
     */

    static int plusMethod(int x, int y) {
        return x + y;
    }

    static double plusMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8, 7); // Return integer value
        double myNum2 = plusMethod(4.5, 9.3); // Return double value

        System.out.println("Int value :" + myNum1);
        System.out.println("Double value :" + myNum2);
    }
}
