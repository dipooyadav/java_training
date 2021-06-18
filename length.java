package practice_question;
import java.util.Scanner;
public class length {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int copy=number;
        int length=0;
        while(copy>0){
            copy=copy/10;
            length++;
        }
        System.out.println(length);
    }
}
