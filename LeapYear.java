
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter a year:");
        int x = S1.nextInt();
        if((x%4==0)&&((x%100!=0)||(x%400==0))){
            System.out.println("It is a Leap year");
        }else{
            System.out.println("Not Leap Year");
        }
    }
}
