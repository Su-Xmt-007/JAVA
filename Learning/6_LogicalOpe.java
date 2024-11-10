
class Logical {

    public static void main(String args[]) {
        int a = 5;
        int b = 4;
        boolean store = a > b && a < b; // Logical AND (T && F)
        System.out.println(store);
        int c = 4, d = 4;
        boolean store1 = d >= c && c <= d; //(T && T)
        System.out.println(store1);

        int e = 4;
        int f = 8;
        boolean store2 = e >= f || e < f; // Logical OR (F || T)
        System.out.println(store2);
        boolean store3 = e > f || f <= e; // (F || F)
        System.out.println(store3);

        int k = 123;
        int l = 14;
        boolean store4 = k == l;
        System.out.println(store4);
        System.out.println(!store4); // Logical NOT

    }
}
