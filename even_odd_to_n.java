package practice_question;
import java.util.Scanner;

public class even_odd_to_n {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i+" is even.");
            }
            else System.out.println(i+" is odd.");
        }
    }
}
