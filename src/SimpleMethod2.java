/**
 *
 * @author Trevor Hartman
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

public class SimpleMethod2 {
    // Put your method code here, takes 1 integer, squares it, returns the integer result of the square.

    public static int square(int parameter) {
        return (int) Math.sqrt( (double) parameter );
    }

    public static void main(String[] args) {
        // Put scanner code to get integer input here

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter # to sqrt: ");
        int input = sc.nextInt();
        System.out.println("");

        // Modify the below call to assign the result of the method call to a variable.

        int modified = square(input);

        // Put the result System.out code here.

        System.out.println(modified);

    }
}
