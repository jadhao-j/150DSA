
import java.util.Scanner;

public class expontailPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int x= sc.nextInt();
        System.out.println("enter the Power : ");
        int y=sc.nextInt();
        int sum=1 ;
        for (int i = 1; i <= y ; i++) {
            sum=sum*x;
        }
        System.out.println(x+" Raise to power "+y+" is "+sum);

    }
}
