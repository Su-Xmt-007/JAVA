class Hello
{
    public static void main(String a[]){
        int num1=67;
        int num2=90;
        byte sum1= 0x6E;
        System.out.println(sum1);

        int num4=1000000000;
        int num5=100_000_000_0;
        System.out.println("Value of num4 is " + num4);
        System.out.println("Value of num5 is " + num5);    
        System.out.println(num1);
        System.out.println(num1+num2);

        char k='j';
        System.out.println(k);
        k++;
        System.out.println(k);
        --k;
        System.out.println(k);

        System.out.println("Size of Float in bytes: " + Float.BYTES);

        System.out.println(9+8 );
        System.out.println("Hello world");
 
    }
}