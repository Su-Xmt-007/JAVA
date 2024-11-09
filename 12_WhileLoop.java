
class WhileLoop {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 3) {
            System.out.println("\n Hi\t" + i + "\n");
            int j = 1;
            while (j <= 3) {
                System.out.println("Buddha\t" + j);
                j++;
            }
            i++;
        }
        System.out.println("\nBye\t" + i + "\n");
    }
}
