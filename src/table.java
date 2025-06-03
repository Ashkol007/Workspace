import java.util.Scanner;

public class table {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        for(int i=0;i<=10;i++){

            System.out.println(i +"x" + n +"="+ n*i );

        }

    }
}
