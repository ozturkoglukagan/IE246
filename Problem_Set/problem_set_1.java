package Problem_Set;

public class problem_set_1 {

    public static void main(String[] args) {
        /*Question 1
        
        System.out.println(powerCalc(3,4));*/

        /*Question 2
        
        int number=4;
        System.out.println(number+"! = "+factorial(number));
        */
        
        /*Question 3 
         
        doubleTriangle(5);
        */

        /*Question 4 */


    }
    public static int powerCalc(int base,int exponent) {
        int result=1;
        for (int i = 0; i < exponent; i++) {
            result=result*base;
        }
        return result;
    }
   
    public static int factorial(int number) {
        if (number>=1) {

            return number*factorial(number-1);
            
        }
        
        return 1;
    }

    public static void doubleTriangle(int row) {
        //to determine the height of the triangles
        int temp=row;
        for (int i = 0; i < row; i++) {
            
            // for first triangle

            for (int j = 0; j < (i+1)*2-1; j++) {
                System.out.print("*");
                
            }
            
            
            // for the blank spaces
            for (int k = 0; k < temp*4-3; k++) {
                System.out.print(" ");
            }
            
            
            // for the second triangles
            for (int l = 0; l < (i+1)*2-1; l++) {
                System.out.print("*");
                
            }
            //to control the height
            temp--;
            System.out.println();
            
        }
        
    }


    public static void primeNum(int min, int max) {
        int count=0;
        for (int i = min; i < max; i++) {
            
            if (isPrime(i)) {
                System.out.println(i+" is a prime number between "+min+" and "+max);
                count++;
            }
        }
        System.out.println("There is "+count+" prime numbers in total.");
    }

    public static boolean isPrime(int number){
        if (number==2) {
            return true;
        }
        for (int i = 2; i < number; i++) {
            
            if (number%i==0) {
                return false;
            }
        }
        
        return true;
    } 
}
