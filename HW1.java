/* Question 1
Create a java program to find a factorial of that number.

Question 2
write a java pr'nts the prime numbers between 350 and 2570

quest'on 3
reports the sum of odd numbers in a given sequence java call??

question 4
smallest "value" in a given sequence
*/

public class HW1 {
    
    public static void main(String[] args) {
        /* Question 1
        int number=4;
        System.out.println(number+"! = "+factorial(number));*/
        
        /* Checking if isPrime method works or not

        if (isPrime(12)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        */
    
        /*Question 2
        primeNum(350, 2570);*/
        
    
    }

    public static int factorial(int number) {
        if (number>=1) {

            return number*factorial(number-1);
            
        }
        
        return 1;
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
