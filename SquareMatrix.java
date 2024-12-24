
import java.util.Scanner;

public class SquareMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Row : ");
        int r=sc.nextInt();
        int count=1;
        for(int i =1;i<=r;i++){
            for(int j=1;j<=r;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        
        }
    }
    
}
