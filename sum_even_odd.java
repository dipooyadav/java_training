package practice_question;
import java.util.Scanner;
public class sum_even_odd {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum_odd=0;
        int sum_even=0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum_even+=i;
            }
            else sum_odd+=i;
        }
        System.out.println("Sum of even numbers is:"+sum_even);
        System.out.println("Sum of odd numbers is:"+sum_odd);
    }
}
