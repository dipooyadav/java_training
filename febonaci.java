package practice_question;
import java.util.Scanner;
public class febonaci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = 0, b1 =1;
        while(b1<n){
            System.out.println(b1);
            int temp =b1;
            b1=b1+b;
            b = temp;
            
        }

    }
}
