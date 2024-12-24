
import java.util.Scanner;

public class FibonacciN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a digit :");
        int x=sc.nextInt();
        int num1=0,num2=1;
        while(num1<x) {
            int num3 =num1+num2;
            num1=num2;
            num2=num3;
        }
        System.out.println("Fibonacci Number at a Specific Position :"+num1);
    }
    
}
