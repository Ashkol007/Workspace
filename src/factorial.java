import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give fact");

        int fact = scanner.nextInt();

        int factors = 1;

        for(int i=1 ; i<=fact ;i++){

             factors *= i;

        }

        System.out.println(factors);

    }
}
