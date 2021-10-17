package Homework_1;

public class secMin {

    public static void main(String[] args) {
        // initializing variables with max possible boundaries
        int maxIntValue = Integer.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;
        int secMinValue = Integer.MAX_VALUE;
        int input;
        // initializing with -1 to be sure if it's value doesn't change, it won't get used in a for loop
         int argPlace = -1;
        // checking the argument quantity
        if (args.length < 2) {
            System.out.println("Not enough arguments, please try again.");
            return;
        }
        // checking through all the arguments to find the smallest number
        for (int i = 0; i < args.length; i++) {
            input = Integer.parseInt(args[i]);
            /*
             * to test if my reading & parsing mechanism works as intended
             * System.out.println(input+10);
             */

            // to check if the number is small enough to be an Integer
            if (input < maxIntValue) {

                // to check if minValue exist
                if (input < minValue) {
                    minValue = input;
                    // saving the index of the smallest number
                    argPlace = i;
                }
                // to give a more meaningful error message to the end user
            } else {
                System.out.println("Number is too big. Please try again.");
            }
        }

        // checking through all the arguments to find the second smallest number
        for (int i = 0; i < args.length; i++) {
            input = Integer.parseInt(args[i]);

            // replacing the smallest value with max integer value to get rid of it
            if (i == argPlace) {
                input = Integer.MAX_VALUE;
            }

            // finding the smallest number in new arguments
            // (this is the second smallest number in our first given argument list)
            if (input < secMinValue) {
                secMinValue = input;

            }

        }
        //printing the second smallest value to terminal
        System.out.println("Second smallest number is: " + secMinValue);

    }

}
