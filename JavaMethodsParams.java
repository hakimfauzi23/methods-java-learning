public class JavaMethodsParams {
    /*
     * You can pass a value in method when it's called
     * In basic method, after method name there blank parenthes
     * If you init somethin inside it, it will be params method
     */

    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");
    }

    /*
     * When you want method return a value
     * It's must have a data type before the method name instead of void keywords.
     */

    static int addition(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {

        /*
         * When parameter passed like these below
         * It's called argument instead of parameter
         */
        myMethod("Jimmy"); // Jimmy is method argument
        myMethod("Hakim"); // Hakim is method argument
        myMethod("Fauzi"); // Fauzi is method argument

        System.out.println(addition(5, 3));
    }
}
