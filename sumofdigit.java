package practice_question;
import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int digit= scn.nextInt();
        int copy=digit;
        int sum = 0;
        while(copy>0){
            int d=copy%10;
            copy/=10;
            sum+=d;
        }
        System.out.println(sum);
    }
}
