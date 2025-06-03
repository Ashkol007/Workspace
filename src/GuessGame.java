import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the no. right : ");
        int number = 50;

        while(true){
            int gnumber = scanner.nextInt();


            if(gnumber==number){
                System.out.println("Congrats you are right ");
                break;
            }else if(gnumber<number){
                int result = number - gnumber ;
                if(result<10){
                    System.out.println("you are close too!!!");
                }
                System.out.println("guess the no. again you are so far");
//                gnumber = scanner.nextInt();
                continue;
            }
        }


    }
}
