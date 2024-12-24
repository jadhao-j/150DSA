
import java.util.Scanner;

public class SumofPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Stating element");
        int Start = sc.nextInt();
        System.out.println("enter a End element");
        int End = sc.nextInt();
        int sum=0;
        for(int i =Start; i<=End;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                sum=sum+i;
            }    
        }
        System.out.println(" Sum of Prime Numbers in a Range "+sum);
    }
}
