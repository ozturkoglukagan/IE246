public class subtract {
   
    public static void main(String[] args) {
        //initializing the 2 numbers we will use
        int number1=0;
        int number2=0;
        // checking the argument quantity
        if (args.length != 2) {
            System.out.println("Please provide two numbers.");
            //using return to finish the program from executing further
            return;
        }
        //assigning the arguments to integers.
        number1 = Integer.parseInt(args[0]);
        number2 = Integer.parseInt(args[1]);
    
        //using boolean we are checking the relationship between our numbers
        if (number1>number2) {
            //printing the result to the console
            System.out.println("First number is larger and the difference is "+(number1-number2)+".");
            //using return to finish the program from executing further
            return;
        }
        
        if (number2>number1) {
            //printing the result to the console
            System.out.println("Second number is larger and the difference is "+(number1-number2)+".");
            //using return to finish the program from executing further
            return;
        }

        if (number1==number2) {
            //printing the result to the console
            System.out.println("Both numbers are the same.");
            //using return to finish the program from executing further
            return;
        }
        

        
    }
}
