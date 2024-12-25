

import java.util.Scanner;

public class DivisorsOfNumber {
    void divisor(int num){
        System.out.println("Divisor of "+num+" are : ");
        for(int i = 1;i<=num;i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("");
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        DivisorsOfNumber s1 = new DivisorsOfNumber();
        int x = sc.nextInt();
        s1.divisor(x);
    }
    
}
