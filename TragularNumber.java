
import java.util.Scanner;

class TragularNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int x=sc.nextInt();
        int sum=0;
        for(int i=1;i<=x;i++){
            sum=sum+i;
        }
        System.out.println(" N-th Triangular Number : "+sum );
    }

}