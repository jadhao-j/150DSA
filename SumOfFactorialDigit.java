
import java.util.Scanner;

public class SumOfFactorialDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number :");
        int x =sc.nextInt();
        int sum=1;
        for(int i=x;i>0;i--){
            sum=sum*i;
        }
        int add=0;
        while(sum>0){
            int rem = sum%10;
            add=add+rem;
            sum=sum/10;
        }
        System.out.println(" Sum of the Digits of the Factorial of a Number : "+add);
    }
    
}
