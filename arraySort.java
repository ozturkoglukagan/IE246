public class arraySort {

    public static void main(String[] args) {
        // creating an array to store arguments
        int[] numbers=new int[args.length];
        
        //to get every argument from the user
        for (int i = 0; i < args.length; i++) {
            numbers[i]=Integer.parseInt(args[i]);
        }
        //to check if there is any arguments
        if (args.length==0) {
            System.out.println("There is no arguments.");
        }
        
        // to store a variable while changing indexes
        int temp = 0;
        //redoing the sorting number algorithm for i times
        for (int i = 0; i < numbers.length; i++) {
            //to check each indexed number 
            for (int j = 0; j < numbers.length - 1; j++) {
                //to control the values of variables 
                if (numbers[j] < numbers[j + 1]) {
                    //switching the variable j and j+1
                    temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }
        //to print the variables in our array to the console
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

}
