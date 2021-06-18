package practice_question;
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int [] marks = new int[5];
        String flag="Pass";
        int average, sum=0;
        for(int i = 0;i<marks.length;i++){
            marks[i]=scn.nextInt();
            if(marks[i]>35) flag = "Fail";
            sum+=marks[i];
        }
        average=sum/marks.length;
        System.out.println(flag+" and averge marks are "+average);

        
    }
}
