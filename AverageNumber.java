
import java.util.Scanner;

public class AverageNumber {
    int average(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return  sum/arr.length;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of element : ");
        int x=sc.nextInt();
        System.out.println("Enter array element : ");
        AverageNumber s1 =new AverageNumber();
        int A[]=new int[x];
        for(int i=0;i<x;i++){
            A[i] =sc.nextInt();
        }
        int result = s1.average(A);
        System.out.println(result);
        
    }
    
}
