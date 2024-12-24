import java.util.Scanner;
public class Fabonacci{
    public static void main(String[] args) {
        
    Scanner s1 = new Scanner(System.in);
    System.out.println("Enter a digit:");
    int x=s1.nextInt();
    int Num1=0 , Num2=1;
    while (Num1<x) {
       System.out.println(Num1 +" ");
       int Num3=Num1+Num2;
       Num1=Num2;
       Num2=Num3;
    }
        
    }
}