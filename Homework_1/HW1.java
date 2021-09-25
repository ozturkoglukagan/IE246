package Homework_1;
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
        
        primeNum(350, 2570);
        
        */
        
        /*Question 3
        
        int[] array={66,3,5,44,7,3,8,-5,9,22,6,-4,1250};
        //System.out.println(array.length);
        sumOdd(array);
        
        */
    
        /*Question 4
        int[] array={66,3,5,44,7,3,8,-5,9,22,6,-4,1250};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
        secMinValue(array);
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }*/

        
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

    public static void sumOdd(int[] array) {
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]<0) {
                
            }else if (array[i]%2==1) {
                count=array[i]+count;
            }
            
        }
       System.out.println(count);
        
    }

    public static void secMinValue(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j]) {    
                    temp = array[i];    
                    array[i] = array[j];    
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[1]+" is the second smallest number.");
    }
}
