
import java.util.Scanner;

public class PrimeRange{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of element in array :");
        
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Prime Number between "+arr[0]+" to "+arr[1]+":");
      
        for(int i=arr[0];i<=arr[1];i++){
            int count=0;
            for(int j=1;j<=i;j++){
            if(i %j==0){
                count++;
            }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}
// import java.util.Scanner;

// public class PrimeRange {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array:");

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         // Input the array elements
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         // Validate array has at least 2 elements for range
//         if (n < 2) {
//             System.out.println("Please provide at least two numbers in the array.");
//             return;
//         }

//         System.out.println("Prime Numbers between " + arr[0] + " and " + arr[1] + ":");

//         // Iterate over the range from arr[0] to arr[1]
//         for (int i = arr[0]; i <= arr[1]; i++) {
//             int count = 0; // Reset count for each number
//             for (int j = 1; j <= i; j++) {
//                 if (i % j == 0) { // Check divisibility
//                     count++;
//                 }
//             }
//             if (count == 2) { // If divisible only by 1 and itself
//                 System.out.println(i);
//             }
//         }
//     }
// }
