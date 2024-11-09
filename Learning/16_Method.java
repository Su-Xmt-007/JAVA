
import java.util.Scanner;

class Computer {

    public void PlayMusic() {
        System.out.println("\nPlaying music.....");
    }

    public int Calculator() {
        return 10 + 20;
    }

    public String GetMePen(int cost) {
        if (cost >= 10) {
            return "You can buy this pen.\n ";
        } else {
            return "You can't buy this  pen.\n";
        }
    }
}

class Demo1 {

    public static void main(String args[]) {
        Computer com = new Computer();
        com.PlayMusic();
        System.out.println("The Result of Calculation is:\t" + com.Calculator());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for the pen:\t");
        int money = sc.nextInt();
        System.out.println("In " + money + " rupees " + com.GetMePen(money));
    }
}
