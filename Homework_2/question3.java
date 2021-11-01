package Homework_2;

public class question3 {
    public static void main(String[] args) {

        double[] a = { 1, 4, -3, 4.5, 5, 5 };

        // to provide the number of items in the array
        int numberofItems = countItems(a);

        // to provide the maximum value in the array
        double maxValue = maximum(a);

        // to provide the number of times the maximum value appears in the array
        int howManyMax = howManyMaximum(a);

        // provides true if all provided doubles are integers with no floating part,
        // otherwise false.
        boolean allInt = allIntegers(a);

        System.out.println(numberofItems);
        System.out.println(maxValue);
        System.out.println(howManyMax);
        System.out.println(allInt);
    }

    // provides true if all provided doubles are integers with no floating part,
    // otherwise false.
    private static boolean allIntegers(double[] a) {
        // creating a temp array to compare the arrays
        int[] tempArray = new int[a.length];

        // creating a control variable
        boolean control = true;

        // filling the array with array a's values parsed to int
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = (int) a[i];
            // System.out.print(tempArray[i]+" ");
        }

        // using outer to break all loops at once
        outer: while (control) {

            // checking throught all the elements of the array
            for (int i = 0; i < a.length; i++) {

                // System.out.print(a[i]+" ");

                // if all the elements are same with each other it will return true
                if (a[i] == tempArray[i]) {
                    control = true;
                } else {

                    // if they arent it will return false
                    return false;
                }

                // to break the loops if all the elements are same
                if (i == a.length - 1) {
                    break outer;
                }
            }

        }

        return control;
    }

    // to provide the number of times the maximum value appears in the array
    private static int howManyMaximum(double[] a) {

        // to hold the max number
        double max = Double.MIN_VALUE;
        int maxcount = 0;

        // finding the max number among the array's elements
        for (double d : a) {
            // if d number is bigger than max, than upgrade max
            if (d > max) {
                max = d;
            }
        }

        // iterating throught elements again to see if there is more than one max value
        for (double d : a) {
            if (d == max) {
                // incrementing the count
                maxcount++;
            }
        }
        return maxcount;
    }

    // to provide the maximum value in the array
    private static double maximum(double[] a) {
        // to hold the max number
        double temp = Double.MIN_VALUE;
        
        // finding the max number among the array's elements
        for (double d : a) {
            // if d number is bigger than temp, than upgrade temp
            if (d > temp) {
                temp = d;
            }
        }
        return temp;
    }

    // to provide the number of items in the array
    private static int countItems(double[] a) {
        //simply return the lenght of the array
        return a.length;
    }
}
