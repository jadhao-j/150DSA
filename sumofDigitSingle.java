import java.util.Scanner;

public class sumofDigitSingle {
    int solution(int num){

        while(num>10){
        int sum=0;
        while(num>0){

            int rem = num%10;
            sum=sum+rem;
            num=num/10;
        }
        num=sum;
    }

     return num;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int x=sc.nextInt();
        sumofDigitSingle s1 = new sumofDigitSingle();
        int result =s1.solution(x);
        System.out.println(result);

    }
    
}
