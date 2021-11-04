
// YOU CAN ONLY ADD LINES TO THIS FILE.
// YOU CANNOT DELETE/CHANGE THE PARTS GIVEN BELOW.

public class ProblemData {
    private double median;
    private double[] data;
    private int[] order;
    private double nthMin;

    public ProblemData(String[] args) {
        // convert strings in args array to doubles
        // create problem instance using these values
        ReadData(args);
    }

    private void ReadData(String[] args) {
        this.data = new double[args.length];
        for(int i=0;i<args.length;i++)
        {
            this.data[i]=Double.parseDouble(args[i]);
        }
    }

    public void computeStatistics() {
        computeOrder();
        computeMedian();
        printMedian();
    }

    private void printMedian() {
        print("median", this.median);
    }

    private void print(String string, double value) {
        System.out.println("The "+ string + " is "+ value);
    }

    private void computeOrder() {
        this.order = new int[this.data.length];

        // Compute the order of the numbers in ascending order starting with 1
        for(int ord=1; ord<=this.data.length;ord++)
        {
            int index = FindMinUnordered();
            this.order[index] = ord;
        }


    }

    private int FindMinUnordered() {
        double thisMin = Double.MAX_VALUE;
        int index = 0;
        for(int i=0; i<this.data.length;i++)
        {
            if(this.data[i]<thisMin && this.order[i]==0)
            {
                thisMin = this.data[i];
                index=i;
            }
        }
        return index;
    }
    private double accessNthMin(int n)
    {
        //returns the nth minimum number
        for (int i=0; i<this.order.length; i++)
        {
            if(this.order[i]==n)
            {
                return this.data[i];
            }
        }
        System.out.println("There is an error. There is no "+n+"th minimum!");
        return 0;
    }

    private void computeMedian() {
        if(this.data.length%2 == 1)// odd
        {
            this.median = accessNthMin(this.data.length/2+1);
        }
        else // even
        {
            this.median = (accessNthMin(this.data.length/2)+accessNthMin(this.data.length/2+1))/2;
        }

    }

    public void printData() {
       for (double d : this.data) {
            System.out.print(d+ " ");
       }
       System.out.println();
    }

    public void printNthMinimum(int i) {
        this.nthMin=accessNthMin(i);
        System.out.println(i+". minimum is "+nthMin);

    }
}