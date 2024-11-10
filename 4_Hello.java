
class Hello4 {

    public static void main(String[] args) {
        int p = 23;
        int c = 5;

        int r = p % c;
        System.out.println("Remainder is:\t\t" + r);
        int v = p / c;
        System.out.println("Division result is:\t" + v);

        System.out.println(p + c);
        System.out.println(p + 8);
        System.out.println(c - 1);
        System.out.println(p * c);
        System.out.println(p * 9);
        System.out.println(c / 2);
        System.out.println("The value of p:\t\t" + p);
        System.out.println("The value of c:\t\t" + c);

        p += 9;
        c *= 10;
        System.out.println("The value of p:\t\t" + p);
        System.out.println("The value of c:\t\t" + c);

        System.out.println("After Post inc p:\t" + p++);
        // First fetch then increment
        System.out.println("After Pre inc p:\t" + ++p);
        // First increment then fetch

        System.out.println("The value of p:\t\t" + p);
        System.out.println("The value of c:\t\t" + c);
        System.out.println("After Post decre p:\t" + p--);
        System.out.println("After Post decre p:\t" + --p + "\n");

    }
}
