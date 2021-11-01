package Homework_2;

public class question1 {
    public static void main(String[] args) {
        // creating the variable in the general scope to use it further
        int minArgsIndex = 0;

        // checking if there are any inputs to work with
        if (args.length == 0) {
            System.out.println("No input, please try again.");
        }

        // creating an order array to save the orders lenghs
        int[] order = new int[args.length];
        
        // initializing the order array
        for (int i = 0; i < order.length; i++) {
            order[i] = 0;
        }
        //creating thisOrder variable
        int thisOrder = 1;

        // iterating for loop for every thisOrder
        for (int i = 0; i < order.length; i++) {

            // setting max value to know if the number is smaller
            int minValue = Integer.MAX_VALUE;

            // iterating through all values in args lenght
            for (int j = 0; j < args.length; j++) {

                // to check if the order is zero
                if (order[j] == 0) {

                    // assigning the value of args[j] to a temp number to compare it
                    int temp = Integer.parseInt(args[j]);

                    // to check if our temp variable is smaller than minValue
                    if (temp < minValue) {
                        minValue = temp;

                        // saving the spot of the smallest number
                        minArgsIndex = j;
                    }
                }
            }
            // saving the thisOrder number to our order array
            order[minArgsIndex] = thisOrder;

            // iterating order number
            thisOrder++;

        }

        // iterating through order length to match thisOrder values to i
        for (int i = 1; i < order.length + 1; i++) {

            // iterating through order array
            for (int j = 0; j < order.length; j++) {

                // checking if i is equal to thisOrder number
                if (order[j] == i) {

                    // printing the number according to the order
                    System.out.print(args[j] + " ");
                }
            }

        }

    }

}
