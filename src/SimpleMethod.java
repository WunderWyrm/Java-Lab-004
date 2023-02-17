/**
 *
 * @author Trevor Hartman
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

public class SimpleMethod {
    // Put your method code here

    public static void square(int parameter) {
        System.out.println( Math.sqrt(
                (double) parameter
                )
        );
        // Is this setup messy, or easy to read?
    }

    public static void main(String[] args) {
        // This is the method call, create the square method.
        square(25);
    }
}
