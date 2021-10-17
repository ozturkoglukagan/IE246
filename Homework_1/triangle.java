package Homework_1;

public class triangle {

    public static void main(String[] args) {

        // to check if there are too many arguments.
        if (args.length != 1) {
            System.out.println("Too much or too less arguments. Please try again.");
            // return to finish reading
            return;
        }
        int sideLength = Integer.parseInt(args[0]);
        triangle(sideLength);
    }

    public static void triangle(int length) {

        // to check if the number is positive
        if (length <= 0) {
            System.out.println("The lenght can neither be negative nor zero. Please try again.");
            return;
        }
        /*
         * drawing the triangle
         */

        // to adjust the height of triangle
        for (int i = 0; i < length; i++) {
            // to print the row part
            for (int j = 0; j < i + 1; j++) {
                // prints the stars
                System.out.print("*");

            }
            // using println to swith to the new row
            System.out.println();
        }

        // calculating and printing the area by using right triangle formula
        System.out.println("Area is: " + ((double) length * length / 2));

    }
}
