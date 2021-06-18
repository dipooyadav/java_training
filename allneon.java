package practice_question;
import java.util.Scanner;
public class allneon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count=0;
        for(int i = 1;i<=n;i++){
            if(neon(i)){
                count++;
            }
            
        }
        System.out.println(count);
    }

    public static boolean neon(int number){
        int square = number*number;
        int sum = 0;
        while(square>0){
            sum+=square%10;
            square/=10;
        }
        if(sum==number){
            return true;
        }
        else return false;
    }
}
