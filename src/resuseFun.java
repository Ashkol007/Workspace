import java.util.Scanner;

public class resuseFun {

    public static void main(String[] args) {



     Scanner scanner = new Scanner(System.in);

     int a =scnValue(scanner,"provide the 1st no.");
     int b =scnValue(scanner,"provide the 1st no.");

        System.out.println(a + b);



    }

    static int scnValue(Scanner scanner,String prompt){
        System.out.println(prompt);
        if(scanner.hasNext()){
            return scanner.nextInt();
        }else{
            System.out.println("please provide the No.");
            return -1;
        }
    }

}
