package IECOZUM;

public class quiz01 {
    
    public static void main(String[] args) {
        //to check the argument number amount
         if (args.length!=2) {
            System.out.println("Just enter two arguments.");
        }
        //creating and initializing two numbers
        int numberOne=Integer.parseInt(args[0]);
        int numberTwo=Integer.parseInt(args[1]);

        //taking the arguments from user and storing them in our variables
       
        if (numberOne>numberTwo) {
            System.out.println("First number is larger and the difference is "+(numberOne-numberTwo)+".");
        } else if (numberTwo>numberOne) {
            
        } else{

        }
    
        


    }

}
