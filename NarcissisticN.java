
import java.util.Scanner;

public class NarcissisticN{
    public static void main(String[] args) {
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int x = sc.nextInt();
        String NumberString =  Integer.toString(x);
        int s1=NumberString.length();
        int rem;
        int sum=0;
        c=x;
        if(s1==2){
            while(x>0){
                rem=x%10;
                sum=(rem*rem)+sum;
                x=x/10;
            }
            if(sum==c){
                System.out.println("Narcissistic Number");
            }

        }
        if(s1==3){
            while(x>0){
                rem=x%10;
                sum=(rem*rem*rem)+sum;
                x=x/10;
            }
            if(sum==c){
                System.out.println("Narcissistic Number");
            }else{
                System.out.println("Not Narcissistic Number");
            }

        }
        if(s1==4){
            while(x>0){
                rem=x%10;
                sum=(rem*rem*rem*rem)+sum;
                x=x/10;
            }
            if(sum==c){
                System.out.println("Narcissistic Number");
            }else{
                System.out.println("Not Narcissistic Number");
            }

        }

    }
}