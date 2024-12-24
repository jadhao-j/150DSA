import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        
   
    Scanner sc = new Scanner(System.in);
    System.out.print("enter a first number: ");
    int x=sc.nextInt();
    System.out.print("enter a second number: ");
    int y=sc.nextInt();
    int gcd=1;
    for (int i = 1; i < x && i<y; i++) {
        if(x%i==0 && y%i==0){
            gcd=i;
        }
    }
    System.out.println("Greatest Common Diviser "+gcd);
}
}
