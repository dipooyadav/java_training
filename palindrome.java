package practice_question;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int copy = number;
        int newnum=0;
        while(copy>0){
            int d = copy%10;
            copy/=10;
            newnum =newnum*10+d;
        }

        if(number==newnum){
            System.out.println("palindrome");
        }
        else System.out.println("not palindrome");
    }
}
