package Problem_Set;

import javax.xml.namespace.QName;

public class problem_set_2 {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < args.length; i++) {
            int current = Integer.parseInt(args[i]);
            if (current>max) {
                max=current;
            }
        }
        int secMax=Integer.MIN_VALUE;
        for (int i = 0; i < args.length; i++) {
            int current = Integer.parseInt(args[i]);
            if (current>max && current !=max) {
                secMax=current;
            }
        }
        if (secMax!=Integer.MIN_VALUE) {
            System.out.println("Secmax is"+secMax);
        } else {
            
        }
        
    }
}




/*int row=3;
        int column=5;
        int temp=row;
        for (int j = 0; j < column; j++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < row-2; i++) {
            System.out.print("*");
            for (int j = 0; j < column-2; j++) {
                System.out.print("x");
            }
            System.out.print("*");
            System.out.println();
        }
       
        for (int j = 0; j < column; j++) {
            System.out.print("*");
        }
        System.out.println();*/