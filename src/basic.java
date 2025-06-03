import java.sql.SQLOutput;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {

        String str1 = new String("ABCDE");

        int age = Integer.parseInt(args[0]);

        Scanner scn = new Scanner(System.in);

        System.out.println("Please enter age");

        int age2 = scn.nextInt();

        if(age2>18){

            System.out.println("wallahh");
        }

    }
}
