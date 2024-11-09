
class DoWhile {

    public static void main(String args[]) {
        int i = 1;
        do {
            System.out.println("No:\t" + i);
            int j = 1;
            while (j <= 10) {
                System.out.println(i * j);
                j++;
            }
            System.out.println("\n\t\tNext\t\t\n");
            i++;
        } while (i <= 5);
    }
}
