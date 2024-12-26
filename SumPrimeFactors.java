
import java.util.Scanner;

public class SumPrimeFactors {
    int solution(int x){
        int sum=0;
        for(int i=1;i<=x;i++){
            if(x%i==0){
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
        
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int x=sc.nextInt();
        SumPrimeFactors s1=new  SumPrimeFactors();
        System.out.println("the Sum of Prime Factors of a Number "+x+" is : "+s1.solution(x));
    }
    
}
