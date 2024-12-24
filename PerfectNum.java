
import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Check the Number :");
    int x=sc.nextInt();
    int sum=0;
    for (int i=1;i<x;i++){
        if(x%i==0){
            sum=i+sum;
        }
    }
    if(x==sum){
        System.out.println(x+" is perfect number");
    }else{
        System.out.println(x+" not is perfect number");
    }
    }
    
}
