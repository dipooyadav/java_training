package practice_question;
import java.util.Scanner;
public class presentinfabonaci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int number = scn.nextInt();
        int b = 0, b1 =1;
        int flag = 0;
        while(b1<n){
            if(number==b1){
                flag=1;
                break;
            }

            int temp =b1;
            b1=b1+b;
            b = temp;
            
        }
        if(flag==1) System.out.println("Present");
        else System.out.println("Not Present");

    }
}