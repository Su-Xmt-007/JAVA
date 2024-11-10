
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the data type for the size:\t");
        String data_type = s.nextLine();

        /*  if (data_type.equals("Character")) {
            System.out.println(2 + " bytes");
        } else if (data_type.equals("Integer")) {
            System.out.println(4 + " bytes");
        } else if (data_type.equals("Long")) {
            System.out.println(8 + " bytes");
        } else if (data_type.equals("Float")) {
            System.out.println(4 + " bytes");
        } else if (data_type.equals("Double")) {
            System.out.println(8 + " bytes");
        } else {
            System.out.println("Invalid data type");
        }
         */
        switch (data_type) {
            case "Character" ->
                System.out.println(2 + " bytes");
            case "Integer" ->
                System.out.println(4 + " bytes");
            case "Long" ->
                System.out.println(8 + " bytes");
            case "Float" ->
                System.out.println(4 + " bytes");
            case "Double" ->
                System.out.println(8 + " bytes");
            default ->
                System.out.println("Invalid data type");
        }

    }

}
