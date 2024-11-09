
class Forloop {

    public static void main(String args[]) {

        for (int i = 1; i <= 2; i++) {

            System.out.println("\n" + i + " no:\n");

            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }

        }
    }
}
