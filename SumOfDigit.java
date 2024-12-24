import java.util.Scanner;
class SumOfDigit{
    public static void main(String[] args) {
    Scanner s1 = new Scanner(System.in);
    System.out.print("Enter a Digit: ");
    int x=s1.nextInt();
    int sum=0,rem;
    while(x>0){
        rem=x%10;
        sum=rem+sum;
        x=x/10;
    }
    System.out.println("Sum of Digit: " +sum);
    }
}