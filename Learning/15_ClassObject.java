
import java.util.Scanner;

class Calculator {

    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

class Demo {

    public static void main(String args[]) {
        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEnter Two no 1 by 1:");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        //double n1 = 4.5;
        // double n2 = 5.6;
        //double result = cal.add(8.90, 27.2);
        //System.out.println(result);
        System.out.println("\nThe Result of this operation:\t" + cal.add(n1, n2) + "\n");
    }
}
