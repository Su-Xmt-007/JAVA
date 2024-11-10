
class Hello3 {

    public static void main(String a[]) {
        byte b = 127;
        System.out.println(b);

        //b = 257;    So, This leads us to error.
        //System.out.println(b);
        int c = b;
        System.out.println(c);

        int d = 12;
        //    byte e = d;  Here int is bigger than byte so type casting needed
        byte e = (byte) d;
        System.out.println(e);

        int m = 257;
        byte n = (byte) m;
        System.out.println(n);

        float f = 5.6f;
        int g = (int) f;
        System.out.println(g);

        byte k = 20, l = 30;
        int result = k * l;
        System.out.println(result);

    }
}
