
import java.util.Scanner;

public class countD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Digit : ");
        int x = sc.nextInt();
        int sum=0;
        while(x>0){
            sum++;
            x=x/10;
         }
         System.out.println(sum);
    }
}