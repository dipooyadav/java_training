package practice_question;
import java.util.Scanner;
public class lar_among_two {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt(), n2 = scn.nextInt();
        if(n1>n2){
            System.out.println(n1+" is greater than " +n2);
        }
        else if(n2>n1){
            System.out.println(n2+"is greater than "+n1);
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
