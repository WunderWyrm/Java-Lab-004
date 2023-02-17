/**
 *
 * @author Trevor Hartman
 * @author Samuel Theiss
 *
 * @since Version 1.0
 *
 */

import java.util.Scanner;

// was <ADD TYPE> instructions? it seems a bit strange that ADD is highlighted in IntelliJ
public class Radians {

    public static double toRadians(double degrees) {
        // Purr, X3 X3
        return degrees * 3.14159265358979323846 / 180.0;
    }

    public static double toDegrees(double radians) {
        // Put your code here
        return radians * 180 / 3.14159265358979323846;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type degrees you'd like converted to radians: ");
        double degrees = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toRadians call here

        System.out.printf("\n%f degrees is %f radians according to homebrew, and %f radians according to Math.\n\n", degrees, toRadians(degrees), Math.toRadians(degrees));

        System.out.print("Type radians you'd like converted to degrees: ");
        double radians = Double.valueOf(scanner.nextLine());

        // Add System.out, your method call, and Math.toDegrees call here

        System.out.printf("\n%f radians is %f degrees according to homebrew, and %f degrees according to Math.\n", radians, toDegrees(radians), Math.toDegrees(radians));

    }
}
