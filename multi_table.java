package practice_question;
import java.util.Scanner;

public class multi_table {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        for(int i =1;i<=10;i++){
            System.out.println(number+" x "+i+" = "+number*i);
        }
    }
}
