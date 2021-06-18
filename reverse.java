package practice_question;
import java.util.Scanner;
public class reverse {
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

        System.out.println(newnum);
    }
}

