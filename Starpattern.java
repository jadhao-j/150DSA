import java.util.Scanner;
public class Starpattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number of row: ");
        int r=sc.nextInt();
        for (int i = 1; i<= r; i++) {
            for(int j = 1 ; j<=r-i; j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
            System.out.print("*  ");
            }
            System.out.println();
        }
    }
}
