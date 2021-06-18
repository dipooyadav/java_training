package practice_question;
import java.util.Scanner;
public class check_singledigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        if(number/10==0){
            System.out.println("Single Digit");
        }
        else System.out.println("Not single digit");
    }
}
