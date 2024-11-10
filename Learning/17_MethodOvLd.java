
import java.util.Scanner;

class Addition {

    public double add(double n1, int n2, double n3) {
        return n1 + n2 + n3;
    }

    public double add(int n1, double n2) {
        return n1 + n2;
    }

    public double add(double n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2, double n3) {
        return n1 + n2 + n3;
    }
}

class MethodOverloading {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number one by one: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        Addition ad = new Addition();
        double r1 = ad.add(a, b, c); // Changed int to double
        System.out.println("Sum of three numbers: " + r1 + "\n");
        System.out.println(ad.add(26.32, b, -58.23) + "\n");

    }
}
