
import java.util.Scanner;

class Geeks {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float result = a / b;
        double result1 = (double) result;

        System.out.printf("%.7f %.3f %n ", result1, result1);
        

    }

}
