
import java.util.Scanner;

class Fibo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position in the Fibonacci series: ");
        int position = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;
        int result = 0;

        if (position == 1) {
            result = firstTerm;
        } else if (position == 2) {
            result = secondTerm;
        } else {
            for (int i = 3; i <= position; i++) {
                result = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = result;
            }
        }

        System.out.println(result);

        scanner.close();
    }
}
