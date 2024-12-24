
import java.util.Scanner;

public class DigitSqureSum {
    int number;
    DigitSqureSum(int n){
        number=n;
    }
    int Calculate() {
        int sum=0;
        while(number>0){
            int rem = number%10;
            sum=(rem*rem)+sum;
            number=number/10;}
            return sum;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Digit : ");
        int x = sc.nextInt();
        DigitSqureSum s1 = new DigitSqureSum(x);
        System.out.println("sum of Squere of the digit is : "+s1.Calculate());



    }

    
}
