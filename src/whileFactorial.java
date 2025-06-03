import java.util.Scanner;

public class whileFactorial {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease give the no.");


        int number = scanner.nextInt();
        int i=1;
        int factorial = 1;

        while(i<=number){

            factorial *= i;
            i++;
        }

        System.out.println(factorial);





    }
}
