
import java.util.Scanner;

public class Armstrongs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Not enough elements to define a range.");
            return;
        }

        System.out.println("Armstrong Numbers between " + arr[0] + " and " + arr[1] + ":");

        for (int num = arr[0]; num <= arr[1]; num++) {
            int temp = num;
            int sum = 0;

            // Calculate sum of cubes of digits
            while (temp > 0) {
                int rem = temp % 10;
                sum =sum+(rem * rem * rem);
                temp =temp/10;
            }

            // Check if the number is an Armstrong number
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}
