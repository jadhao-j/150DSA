import java.util.Scanner;

public class OddRange {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Range :");
        int start=sc.nextInt();
        int end = sc.nextInt();
        int sum=0;
        for (int i = start; i <= end; i++) {
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("sum of the Odd number between "+start+" to "+end+" : "+sum);
    }
    
}
