
import java.util.Scanner;

public class NumPattern {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number of Row : ");
    int r =sc.nextInt();
    int num=1;
    for(int i =1 ;  i<=r ; i++){
        for(int j=1;j<=i;j++){
            System.out.print(num+" ");
            num++;
        }
        System.out.println();
    }  
}
}