
class condition {

    public static void main(String args[]) {
        int k = 45;
        int l = 23;
        int m = 90;

        System.out.println("\nHere the numbers are: k=45, l=23 and m=90  \n");
        System.out.print("FIRST WAY:\n");
        if (k > l && k > m) {
            System.out.println("Andk is the biggest no:\t" + k);
        } else if (l > k && l > m) {
            System.out.println("And l is the biggest no\t :" + l);
        } else {
            System.out.println("\nAnd m is the biggest no:\t" + m);
        }

        int age = 19;
        if (age > 18) {
            System.out.println("\nYour are an Adult:\t" + age);
        }

        int no = 20;
        if (no % 2 == 0) {
            System.out.println("\nThe number is even.\n");
        } else {
            System.out.println("The no is odd.");
        }

    }
}
