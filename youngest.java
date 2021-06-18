package practice_question;
import java.util.Scanner;

public class youngest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1=scn.nextInt(), n2 = scn.nextInt(), n3=scn.nextInt();
        if(n1<n2 && n1<n3){
            System.out.println(n1+" is the youngest");
            
        }
        else if(n2<n1 && n2<n3){
            System.out.println(n2+" is youngest");
        }
        else if(n3<n1&&n3<n2){
            System.out.println(n3+" is youngest");
        }
    }
}
