package Homework_1;

public class secMin {

    public static void main(String[] args) {
        // creating and initializing an array to use args in our method
        int[] input = new int[args.length];
        // checking the argument quantity
        if (args.length < 2) {
            System.out.println("Not enough arguments, please try again.");
            return;
        }
        // checking through all the arguments to copy them to an array
        for (int i = 0; i < args.length; i++) {
            input[i] = Integer.parseInt(args[i]);
            /*
             * to test if my reading & parsing mechanism work as intended
             * System.out.println(input[i]+10);
             */
        }
        secMin(input);
    }

    public static void secMin(int[] nums) {
        // initializing variables with max possible boundaries
        int maxIntValue = Integer.MAX_VALUE;
        int minValue = Integer.MAX_VALUE;
        int secMinValue = Integer.MAX_VALUE;
        //creating a temp variable to compare values and find the smallest one
        int temp = 0;
        // initializing with -1 to be sure if it's value doesn't change, it won't get used in a for loop
        int argPlace = -1;
        for (int i = 0; i < nums.length; i++) {
            
            temp = nums[i];

            // to check if the number is small enough to be an Integer
            if (temp < maxIntValue) {

                // to check if minValue exist
                if (temp < minValue) {
                    minValue = temp;
                    // saving the spot of the smallest number
                    argPlace = i;
                }
                // to give a more meaningful error message to the end user
            } else {
                System.out.println("Number is too big. Please try again.");
            }

        }

        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];

            // replacing the smallest value with max integer value to get rid of it
            if (i == argPlace) {
                temp = Integer.MAX_VALUE;
            }

            // finding the smallest number in new arguments
            // (this is the second smallest number in our first given argument list)
            if (temp < secMinValue) {
                secMinValue = temp;

            }

        }
        // printing the second smallest value to terminal
        System.out.println("Second smallest number is: " + secMinValue);
    }

}
