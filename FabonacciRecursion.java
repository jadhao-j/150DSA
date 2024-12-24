import java.util.Scanner;

public class FabonacciRecursion {
    int solution(int num){
        if(num<=1){
            return num;
        }
        return solution(num-1)+solution(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        FabonacciRecursion s1 = new FabonacciRecursion();
        for(int i=0;i<num; i++){
        int Result=s1.solution(i); 
        System.out.println(Result); 
    }
}
    
}
