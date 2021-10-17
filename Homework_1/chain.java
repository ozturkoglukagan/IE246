package Homework_1;

public class chain {
    public static void main(String[] args) {
        //creating a double array for the 10 numbers we will be printing and calculating
        double[] numbers = new double[10];
        //to check if there is three arguments
        if (args.length != 3) {
            System.out.println("Too much or too less arguments. Please try again by typing exactly 3 arguments.");
            // return to finish the program
            return;
        }
        // to parse arguments as doubles
        for (int i = 0; i < 3; i++) {
            numbers[i] = Double.parseDouble(args[i]);
            /* to check if my parse mechanism works as intended
             * System.out.println(numbers[i]);
             */
        }
        //calling the method
        chain(numbers);
    }

    public static void chain(double[] nums) {
        //printing the first 3 numbers
        System.out.print(nums[0] + " " + nums[1] + " " + nums[2]);
        // to sum and print numbers 7 times
        for (int i = 3; i < 10; i++) {
            //filling our array with the missing sum values 
            nums[i] = nums[i - 3] + nums[i - 2] + nums[i - 1];
            //to print to the console
            System.out.print(" " + nums[i]);
        }

    }
}
