import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = scanner.nextInt();
        if (x % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }
        
        scanner.close();
    }
}