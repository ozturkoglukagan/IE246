

// YOU CAN ONLY ADD LINES TO THIS FILE.
// YOU CANNOT DELETE/CHANGE THE PARTS GIVEN BELOW.

public class Execute {

    public static void main(String[] args) {
        // This code takes a set of input values as doubles
        // and prints the median
        // Use this arguments as an example: 12 11 1 2 13 4.6
        checkData(args);
        ProblemData problemData = new ProblemData(args);
        problemData.computeStatistics();
        

        problemData.printData(); // I'd like this to print out all the given numbers. (4/10 pts)
        // For the given example, the output should exactly be: 12.0 11.0 1.0 2.0 13.0 4.6

        problemData.printNthMinimum(5); // I'd like this to print out the n-th minimum with the given n on the screen. (6/10 pts)
        // For the given example, the output should exactly be: 4. minimum is 11
        // If we write problemData.printNthMinimum(5); here, the output should exactly be: 5. minimum is 12
    }

    private static void checkData(String[] args) {
        if(args.length==0)
        {
            System.out.println("Input some data values. Usage: java Execute [numbers].");
        }

    }

}

