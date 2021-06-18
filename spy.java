package practice_question;

import java.util.Scanner;
public class spy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        int copy=number;
        int sum = 0;
        int mul =1;
        while(copy>0){
            int d=copy%10;
            copy/=10;
            sum+=d;
            mul*=d;
        }
        if(sum==mul){
            System.out.println("This no is a spy number");
        }
        else System.out.println("This number is not a spy number");
    }
}
