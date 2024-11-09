
class SwapVar {
    public static void main(String[] args) {
        String name = "xempty";
        String vill = "Barabari";
        String swap;
        System.out.println(name);
        System.err.println(vill);
        swap = name;
        name = vill;
        vill = swap;
        System.out.println(name);
        System.err.println(vill);
    }
}
