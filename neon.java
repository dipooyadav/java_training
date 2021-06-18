package practice_question;
import java.util.Scanner;
public class neon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int square = number*number;
        int sum = 0;
        while(square>0){
            sum+=square%10;
            square/=10;
        }
        if(sum==number){
            System.out.println("This number is neon number");
        }
        else System.out.println("This number is not neon number");
    }
}
