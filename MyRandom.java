import java.util.Random;

public class MyRandom {

    private Random randomGenerator = new Random();

    public MyRandom(int seed) {

        // set seed once

        this.randomGenerator.setSeed(seed);

    }

    private int randDiscrete(int lb, int ub) {

        // this method generates numbers between lb and ub (both inclusive)

        ub = ub + 1;

        int outcome = this.randomGenerator.nextInt(ub - lb);

        outcome += lb;

        return outcome;

    }

    private boolean randBoolean(double successProb) {

        double d = this.randomGenerator.nextDouble();

        boolean outcome = false;

        if (d < successProb)

        {

            outcome = true;

        }

        return outcome;

    }

    // Suggested Pseudocode:

    public int Seinfeld(int i, int j) {
        // Put these numbers in an integer array (say outcome)
        int outcome[] = new int[j + 1 - i];
        // Put these numbers in a double array (say prob)
        /*
         * to debug my code 
         * int counter=0;
         */
        double prob[] = new double[j + 1 - i];
        for (int num = 0; num < j + 1 - i; num++) {
            outcome[num] = num + i;
            prob[num] = num + i;
            /*
             * to check if my mechanism works correctly counter++;
             * System.out.print(outcome[num] + "\n "); System.out.print(prob[num] + "\n ");
             */
        }
        // to debug System.out.println();
        // Set sumValue to the sum of all values in prob
        double sumValue = 0;
        for (double d : prob) {
            sumValue = sumValue + d;
            /*
             * to debug 
             * counter++; System.out.print(counter+" ");
             */

        }
        
        /* to check sumvalue adds up
        System.out.println(sumValue);
        
        to check if total is 1.0
         * double probability = 0;
         */
        // Divide each value in prob with sumValue
        for (int k = 0; k < prob.length; k++) {
            prob[k] = prob[k] / sumValue;
            /* to check my code
             * System.out.println(prob[k]); probability = probability + prob[k];
             */
        }
        
        /* to see if my total is 1.0
         * System.out.println(probability + " probability");
         */

        // Array prob now has the probability of each outcome

        // Randomly generate a uniform random variable (say r) between zero and one
        Random rand = new Random();
        double r = rand.nextDouble();
        // Set index=0
        int index = 0;
        // While r>0:
        while (r > 0) {
            // if(prob[index]>r): return outcome[index]
            if (prob[index] > r) {
                return outcome[index];
                // else: r=r-prob[index] and index=index+1
            } else {
                r = r - prob[index];
                index = index + 1;
            }
        }

        return 0;
    }

}
