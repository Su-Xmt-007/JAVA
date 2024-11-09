
public class JaggedArr20 {

    public static void main(String[] args) {
        int num[][] = new int[3][];
        num[0] = new int[3]; // 0: * * *
        num[1] = new int[4]; //1: * * * *
        num[2] = new int[2]; //2: * *

        System.out.println("\nThe Length of num array is: " + num.length);
        for (int i = 0; i < num.length; i++) {

            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = (int) (Math.random() * 10);
                System.out.print(num[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.println("\3n");

        for (int n[] : num) {
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println("\n");
        }

    }
}
