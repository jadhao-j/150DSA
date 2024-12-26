import java.util.Scanner;

public class SecondLargest {
    int solution(int arr[]){
        int large=arr[0];
        int secondLarge=arr[0];
        for(int i = 1 ;  i<arr.length ; i++){
            if(large<arr[i]){
                secondLarge=large;
                large=arr[i];
            } else if (arr[i] > secondLarge && arr[i] != large) {
                secondLarge = arr[i]; 
            }
        }
        return secondLarge;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of element : ");
        int x=sc.nextInt();
        System.out.println("Enter array element : ");
        SecondLargest s1 =new SecondLargest();
        int A[]=new int[x];
        for(int i=0;i<x;i++){
        A[i] =sc.nextInt();
        }
        System.out.println("Second Largest number is : "+s1.solution(A));

    }
    
}
