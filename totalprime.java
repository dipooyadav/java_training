package practice_question;
import java.util.Scanner;
public class totalprime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum_prime=0;
        for(int i=2;i<=n;i++){
            if(prime(i)){
                sum_prime+=i;
            }
        }
        System.out.println(sum_prime);

    }

    public static boolean prime(int number) {
        int fact=0;
        for(int i =1;i<=number;i++){
            if(number%i==0){
                fact++;
            }
        }
        if(fact>2){
            return false;
        }
        else{
            return true;
        }
    }
}
