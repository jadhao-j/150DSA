
import java.util.Scanner;

public class AmstrongNumber {
    
    public static void main(String[] args) {
        int c;
        Scanner S1 = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int x = S1.nextInt();
        int rem,sum=0;
        c=x;
        while(x>0){
            rem=x%10;
            sum=(rem*rem*rem)+sum;
            x=x/10;
        }
        if(c==sum){
            System.out.println("It is an Amstrong Number");
        }else{
            System.out.println("Not Amstrong Number");
        }
    }
}
