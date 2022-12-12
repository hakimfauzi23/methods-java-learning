public class JavaScope {
    /*
     * There are rule where variables can only be accessible inside the region
     * they are created in Java. It's called scope.
     */
    public static void main(String[] args) {
        /*
         * Method scope
         * Variables declared inside the method are available anywehere after the
         * declaration of the variable.
         */

        // Cannot use variable x in here!

        int x = 400;

        // Can use variable x in here!
        System.out.println(x);

        /*
         * Block scope
         * Variable declared inseide blocks of code are only accesible by code between
         * the curly braces,
         */

        {
            int y = 80;

            System.out.println(y); // can use variable y here
        }

        // Cannot use variable y here!
    }
}
