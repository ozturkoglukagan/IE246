class hello {
    public static void main(String[] args) {
        // Update the MyRandom class, so that I can do the following in another class.

        MyRandom myRand = new MyRandom(15);

        int outcome = myRand.Seinfeld(2,10);
        
        System.out.println(outcome);
        
        /*int outcomes[]=new int[2];  
        for (int i : outcomes) {
            System.out.println(i);
        }
        for (int num = 2; num < 4+1; num++) {
            System.out.println(num);
        }*/

        // Randomly generates an integer with Seinfeld Distribution

        // between given two positive integers (both inclusive).

        // A Seinfeld Distribution has the following property:

        // Each number appears with a probability that is

        // proportional to the value.

        // In the example, possible outcomes are 2, 3, 4

        // So the probability that these appear should be

        // proportional to 2, 3, 4, respectively.

        // Their sum is 2+3+4=9,

        // therefore the outcomes and probabilities are:

        // 2 -> with probability 2/9

        // 3 -> with probability 3/9

        // 4 -> with probability 4/9

       

    }
}