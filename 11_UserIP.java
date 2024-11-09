
import java.util.Scanner;

class UserIP {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = s.nextLine();

        System.out.println("Enter your age:");
        int age = s.nextInt();

        System.out.println("Enter your height");
        double height = s.nextDouble();

        s.nextLine();
        System.out.println("Enter your fav game");
        String game = s.nextLine();

        System.out.println("\n\nHi..." + name + "!!!");
        System.out.println("\nYou are " + age + " years old.");
        System.out.println("\nYour Height is: " + height + " cm.So, You can play BusketBall.");
        System.out.println("\nYou are a " + game + " lover.\n");

        s.close();
    }
}
