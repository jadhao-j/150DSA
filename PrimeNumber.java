import java.util.Scanner;
public class PrimeNumber{
public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("enter a number:");
    int x = var.nextInt();
    int i;
    int count=0;
    for(i=1;i<=x;i++){
        if(x%i==0){
           count++;
        }
    }
        if(count==2){
            System.out.println("Prime Number");
        
        }else{
            System.out.println("Not prime Number");
        }
    }
}    
