package practice_question;
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println(number+" is "+evenorodd(number)+" and "+prime(number));
    }   


    public static String evenorodd(int number) {
        if(number%2==0){
            return "even";
        }
        else{
            return "odd";
        }
    }

    public static String prime(int number) {
        int fact=0;
        for(int i =1;i<=number;i++){
            if(number%i==0){
                fact++;
            }
        }
        if(fact>2){
            return "not prime";
        }
        else{
            return "prime";
        }
    }
}
